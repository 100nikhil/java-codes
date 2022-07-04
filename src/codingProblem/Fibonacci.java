package codingProblem;

import java.util.Arrays;

public class Fibonacci {

	static int[] fibonacci(int range) {

		int[] arr = new int[range];
		if(range == 1) {
			arr[0] = 0;
			return arr;
		}
		if(range == 2) {
			arr[0] = 0;
			arr[1] = 1;
			return arr;
		}
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<range; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Arrays.stream(fibonacci(20)).forEach(x -> System.out.print(x+" "));
	}

}
