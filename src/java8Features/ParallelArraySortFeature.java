package java8Features;

import java.util.Arrays;
/*
 * Advantage : parallelSort() method uses concept of MultiThreading 
 * which makes the sorting faster as compared to normal sorting method.
 * 
 */
public class ParallelArraySortFeature {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3,1,5,2,-1,10,7,8};
		int[] arr1 = new int[] {3,1,5,2,-1,10,7,8};
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		Arrays.parallelSort(arr);     //sorting whole array
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		Arrays.parallelSort(arr1,0,4);  //sorting a section of array
		
		for(int i: arr1) {
			System.out.print(i+" ");
		}
		
	}

}
