package subsetsOfASetWithTargetSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

/*
 * suppose arr = [2,3,4,1,5],   targetSum = 6
 * 
 * first column j=0, is all true because {} empty set is subset of all sets. So 0 as a sum can be achieved by all
 * first row is all false except for 0, because empty{} set can make sum 0 only.
 * 
 *             0	      1 	     2       	 3      	   4	       5	      6
 *  {}empty   true		false		false		false		false		false		false
 *  2 a0	  true 		false		true		false		false		false		false
 *  3 a1	  true		false		true		true		false		true		false
 *  4 a2      true		false       true		true		true		true		true
 *  1 a3      true		true		true		true		true		true		true
 *  5 a4      true		true		true		true		true		true		true
*/

public class isSubsetWithTargetSumPossible {

	public static class Pair {
		int i;
		int j;
		String psf; // path so far

		public Pair(int i, int j, String psf) {
			this.i = i;
			this.j = j;
			this.psf = psf;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		int targetSum = Integer.parseInt(bf.readLine());

		boolean[][] dp = new boolean[n + 1][targetSum + 1];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < targetSum + 1; j++) {
				if (j == 0) { // for first column all true
					dp[i][j] = true;
				} else if (i == 0) { // for first row all false except j=0, which is already included in previous if
					dp[i][j] = false;
				} else {
					if (dp[i - 1][j]) { // by excluding the element
						dp[i][j] = true;
					} else if (j >= arr[i - 1]) { // by including
						if (dp[i - 1][j - arr[i - 1]] == true) {
							dp[i][j] = true;
						}
					}
				}
			}
		}

		System.out.println(dp[arr.length][targetSum]); // printing the last most cell of table.

		System.out.println("---- The formed dp[][] array is ----");

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < targetSum + 1; j++) {
				System.out.print(String.format("%-10s", dp[i][j]));
			}
			System.out.println();
		}

		// ----- Now we can print all possible subsets with given target sum by
		// reverse-engineering -----
		/*
		 * Concept:
		 * 
		 * We create a queue and add the last element in it. dp[arr.length][targetSum]
		 * 
		 * then we check it's previous nodes (in above row) dp[i-1][j] & dp[i-1][j -
		 * arr[i-1]] if they are true add them to queue else don't add them. then repeat
		 * procedure until we reach first element dp[0][0]
		 * 
		 */

		Queue<Pair> queue = new ArrayDeque<>();
		queue.add(new Pair(n, targetSum, "")); // for last element i=n, j=targetSum, path_so_far = ""

		while (queue.size() > 0) {
			Pair rem = queue.remove();

			if (rem.i == 0 && rem.j == 0) {
				System.out.println(rem.psf);
				String[] indexarr = rem.psf.trim().split(" ");
				System.out.print("subset -> [ ");
				for(String ind: indexarr) {
					System.out.print(arr[Integer.parseInt(ind)]+" ");
				}
				System.out.println("]");
				System.out.println();
			} else {

				boolean exc = dp[rem.i - 1][rem.j]; // cell right above (when the current element excluded)

				if (exc) {
					queue.add(new Pair(rem.i - 1, rem.j, rem.psf));
				}
				if (rem.j >= arr[rem.i - 1]) { // we can include curr element only if it is <= sum or j value
					boolean inc = dp[rem.i - 1][rem.j - arr[rem.i - 1]]; // when curr element included

					if (inc) {
						queue.add(new Pair(rem.i - 1, rem.j - arr[rem.i - 1], rem.psf + " " + (rem.i - 1)));
					}
				}
			}

		}

	}

}
