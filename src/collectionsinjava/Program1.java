package collectionsinjava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Program1 {

	public static void main(String[] args) {
		
		List<Object> stuff = new ArrayList<>();   //Collections can contain multiple types of elements or objects
		stuff.add(1);
		stuff.add("Stanley");		
		stuff.add(23.45f);
		stuff.add(10.23);
		for(int i=0; i<stuff.size(); i++) {
			System.out.println(stuff.get(i));
		}
		System.out.println("....");
		
		//enhanced for-loop
		for(Iterator<Object> i = stuff.iterator(); i.hasNext();) {
			System.out.println(i.next());    //return next element, advances cursor by one place
		}
		System.out.println("....");
		
		//ListIterator with while loop, access in both directions. Provide previous() method
		ListIterator<Object> i = stuff.listIterator();
		while(i.hasNext()) {
			if(i.next().equals("Stanley")) {
				i.remove();
				System.out.println("Removing...");
			}
			else {
				i.previous();
			}
			System.out.println(i.next());
		}
		System.out.println("....");
		
		//Enumeration works with legacy classes only i.e., Vector & Stack
		Vector<String> games = new Vector<>();
		games.add("Football");
		games.add("Cricket");
		games.add("Badminton");
		games.add("Baseball");
		Enumeration<String> en = games.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
