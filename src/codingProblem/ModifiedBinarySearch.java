package codingProblem;

/*
 * In this problem you will be given a sorted array and a key, you have to to return how many elements of
 * this array are smaller than the key. 
 * 
 *  Ex:- arr = [1,3,5,7,9,10,15,20]   key = 12
 *  		
 *  	our answer will be 6 : as 1,3,5,7,9,10 are all smaller than 12
 *  
 *  arr = [2,3,5,7]    key = 1
 *  	 
 *  	our answer will be 0
 *  
 *  arr = [2,3,4,7]    key = 10
 *  
 *  	our answer will be arr.length = 4
 *  
*/

public class ModifiedBinarySearch {

	public static int noOfSmallerElements(int[] ar, int k) {
		
		int n = ar.length;
		int first = 0;
		int last = n-1;
		int mid = (first+last)/2;
		
		if(ar[0]>k) {
			return 0;
		}
		else if(ar[n-1]<k) {
			return n;
		}
		else {
			while(first<=last) {
				System.out.println(first+"-"+mid+"-"+last);
				if(ar[mid]<k) {
					first = mid+1;
				}
				else if(ar[mid]==k) {
					return mid;
				}
				else {
					last = mid-1;
				}
				mid = (first+last)/2;	
			}
		}
		return first;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,3,7,8,10,15,17,20,21,25,29,32,37,44,47,52,60,69,71,75};
		//int[] arr = new int[] {1,3,5,7};
		System.out.println(noOfSmallerElements(arr, 45));
	}

}
