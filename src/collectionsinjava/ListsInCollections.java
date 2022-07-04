package collectionsinjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class ListsInCollections {

	public static void main(String[] args) {
		List<String> games = new ArrayList<>();
		games.add("Cricket");
		games.add("Football");
		games.add("Jawelin");
		games.add("Badminton");
		for(String game: games) {
			System.out.println(game);
		}
		games.stream().filter(g -> g.startsWith("F")).forEach(System.out::println);
		System.out.println("----------------");
		
		
		//LinkedList implements both List & Queue interface.
		
		List<Integer> nums = new LinkedList<>();
		nums.add(0);
		nums.add(1);
		nums.add(2,4);
		for(Integer num: nums) {
			System.out.println(num);
		}
		System.out.println("----------------");
		
		Queue<Integer> nums1 = new LinkedList<>();
		nums1.offer(1);  //throws exception if exceeds the size of queue. Otherwise same as add
		nums1.add(2);
		nums1.add(3);
		System.out.println("Head : "+nums1.peek());
		for(Integer num: nums1) {
			System.out.println(num);
		}
		System.out.println("----------------");
		
		List<String> actors = new Vector<>();  //Vector is synchronized, legacy class
		actors.add("Chris Hamsworth");
		actors.add("Ramcharan");
		actors.add("Akshay Kumar");
		actors.add("Robert Downey Junior");
		for(String actor: actors) {
			System.out.println(actor);
		}
		System.out.println(actors.subList(1,3));
		System.out.println("----------------");
		
		Stack<String> actresses = new Stack<String>();
		actresses.add("Jennifer Lawrence");
		actresses.add("Margot robbie");
		actresses.add("Disha Patani");
		actresses.add("Christen Stewart");
		for(String actress: actresses) {
			System.out.println(actress);
		}
		System.out.println("----------------");
		System.out.println(actresses.pop());
		System.out.println("New Size after pop : "+actresses.size());
		actresses.push("Gal gadot");
		System.out.println("New Size after push : "+actresses.size());
	}

}
