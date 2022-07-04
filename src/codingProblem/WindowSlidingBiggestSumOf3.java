package codingProblem;
/*
 *	find greatest sum of 3 consecutive integers; 
 *	
 *	we will slide a window of size 3 throughout array
*/

public class WindowSlidingBiggestSumOf3 {
	
	public static void main(String[] args) {
		int[] arr = new int[] {45,100,12,3,22,19,30,21,32,11,22,76,2,1,22,44,66,33,23};
		int k = 3;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<k; i++) {
			sum += arr[i];
		}
		if(sum>max) {
			max = sum;
		}
		for(int i=k; i<arr.length; i++) {
			sum = sum + arr[i] - arr[i-k];
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}
