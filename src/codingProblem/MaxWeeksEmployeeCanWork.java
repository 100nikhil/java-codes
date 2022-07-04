package codingProblem;

import java.util.Scanner;

/*
 * An array is given arr = [5, 7, 10, 3 ... ] representing the no. of modules in each of project.
 * proj1, proj2, ......
 *
 * An employee can work on one module only in a week. & Employee can't work on module of same project in consecutive
 * weeks.
 * 
 * we have to find max no. of weeks he can work
 * 
 * ex: arr = [7, 2, 3]
 * 
 * employee will have to work on module from different project each week.
 * 
 * So he will work like -
 * 
 * first, second, first, second, first, third, first, third, first, third, first
 * 
 * 1 module of "first" project is left. Because it can't fit in non-consecutive flow of modules
 * 
 * 11 weeks is max he can work
 * 
 * 
 * */

public class MaxWeeksEmployeeCanWork {

	static int maxWeeks(int[] arr) {
		if(arr.length == 1) {
			return 1;
		}
		int weeks = 0;
		int proj1 = 0;  //index of proj1
		int proj2 = 1;	//index of proj2
		
		int last = proj2>proj1 ? proj2 : proj1;
		
		while(last<arr.length) {
			arr[proj1] -= 1;
			arr[proj2] -= 1;
			
			weeks += 2;
			
			last = proj2>proj1 ? proj2 : proj1;
			
			if(arr[proj1]==0) {
				proj1 = last+1;
				last+=1;
			}
			if(arr[proj2]==0) {
				proj2 = last+1;
				last+=1;
			}
			System.out.println(proj1+" - "+proj2+" - "+last);
		}
		if(proj1<arr.length && arr[proj1]!=0) {
			weeks += 1;
		}
		if(proj2<arr.length && arr[proj2]!=0) {
			weeks += 1;
		}
		return weeks;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		System.out.println("Enter elements of array : ");
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Max no. of weeks : "+maxWeeks(arr));
		
		sc.close();
	}

}
