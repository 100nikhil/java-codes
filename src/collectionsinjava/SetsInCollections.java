package collectionsinjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsInCollections {

	public static void main(String[] args) {
		Integer[] nums = new Integer[] {1,2,3,4,5,4,10,3,3,7,2,1,6};  //repeated numbers
		List<Integer> nums1 = Arrays.asList(nums);
		
		Set<Integer> numbers = new HashSet<Integer>(nums1);				//set contain unique records only
		for(Integer n: numbers) {
			System.out.print(n+" ");
		}
		System.out.println("");
		
		Set<Integer> numbers1 = new LinkedHashSet<Integer>(nums1);	  //it maintains insertion order
		for(Integer n: numbers1) {
			System.out.print(n+" ");
		}
		System.out.println("");
		
		Set<String> actors = new TreeSet<>();	  //It keeps element in sorted order
		actors.add("Chris Hemsworth");
		actors.add("Randeep Hooda");
		actors.add("Ben Affleck");
		actors.add("Robert Downey Junior");
		actors.add("Leonardo de Caprio");
		actors.add("Jason Statham");
		actors.add("Dwayne Jhonson");
		actors.add("Brad Pitt");
		for(String a: actors) {
			System.out.println(a);
		}
		System.out.println("---------");
		
		NavigableSet<Integer> companies = new TreeSet<>();
		companies.add(1);
		companies.add(4);
		companies.add(5);
		companies.add(8);
		System.out.println(companies.ceiling(3));
		System.out.println(companies.ceiling(10));  //ceiling return equal or just greater
		System.out.println(companies.floor(10));  
		System.out.println(companies.floor(5));  //ceiling return equal or just smaller
		System.out.println(companies.lower(5));
		System.out.println(companies.higher(5));  
	}

}
