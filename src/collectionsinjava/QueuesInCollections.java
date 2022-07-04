package collectionsinjava;

import java.util.Collections;
import java.util.PriorityQueue;

public class QueuesInCollections {
	
	//Natural ascending order (min-heap)
	//static PriorityQueue<String> players = new PriorityQueue<String>();
	
	//descending order (max-heap)
	static PriorityQueue<String> players = new PriorityQueue<String>(Collections.reverseOrder());
	
	public static void main(String[] args) {
		players.add("Virat Kohli");
		players.add("A B Deviliers");
		players.add("Sachin Tendulkar");
		players.add("Bret Lee");
		
		System.out.println(players);
		System.out.println(players.peek());
		System.out.println(players.poll());
		System.out.println(players.peek());
	}

}
