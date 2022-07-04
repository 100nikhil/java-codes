package codingProblem;

/*
 	1 = "a", 2 = "b", ..... 11 = "k" ,..... 26 = "z" 
 	All possible combinations of messages for a given string ex: 12345
 	if 0 is first then return 0. cause for 0 we got no equivalent value.
 	"" return 1 , for empty string only 1 possible way is there.
 	
 	Face-book coding question.
*/

public class NoOfDecodedStrings {

	public static void main(String[] args) {
		int[] data = new int[] {1,1,1,1,0};
		int result = num_ways_dp(data);
		System.out.println("No. of decoded ways is : "+result);
	}

	private static int num_ways_dp(int[] data) {
		int[] memo = new int[data.length + 1];
		for(int i=0; i<data.length+1; i++) {
			memo[i] = -1;
		}
		return helper_dp(data, data.length, memo);
	}

	private static int helper_dp(int[] data, int k, int[] memo) {
		if(k==0) {
			return 1;
		}
		int s = data.length - k;
		if(data[s] == 0) {
			return 0;
		}
		if (memo[k] != -1) {
			return memo[k];
		}
		int result = helper_dp(data, k-1, memo);
		if(k>=2 && Integer.parseInt((""+data[s]+data[s+1])) <= 26) {
			result += helper_dp(data, k-2, memo);
		}
		memo[k] = result;
		return result;
		
	}
}
