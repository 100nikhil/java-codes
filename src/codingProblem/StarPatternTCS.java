package codingProblem;

public class StarPatternTCS {

	static void star(int n) {
		int curr = 1;
		for (int i = 0; i < n; i++) {
			int x = n - (i + 1);

			for (int j = 0; j < x; j++) {
				System.out.print(curr);
				curr++;

			}
			for (int k = x; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		star(10);
	}

}
