package codes;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Code1 {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(null);
		l.add(-8);
		l.add(10);
		l.add(-20);
		//null pointer exception at runtime due to null comparison
		Comparator<Integer> r = Collections.reverseOrder();
		Collections.sort(l, r);
		l.stream().forEach(System.out::println);
	}

}
