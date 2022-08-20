package collectionsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * TO make collections thread safe we can synchronize them using Collections methods.
 * But it costs performance. because only one thread can access the collection now.
 * 
 *  That's why we have concurrent collections to address the performance issue.
 *  Ex:- ConcurrentHashMap
*/

class MyCollection implements Runnable{
	List<String> l = new ArrayList<String>();
	List<String> ls;
	MyCollection(){		
		l.add("Muzaffarnagar");
		l.add("Breley");
		l.add("Modinagar");
		l.add("Ghaziabad");
		ls = Collections.synchronizedList(l); //synchronizing list
	}
	
	@Override
	public void run() {
		//using synchronized list for thread safety
		ls.forEach(item -> {
			try {
				Thread.sleep(300);
				System.out.println(item);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		});
	}
}

public class SynchronizedCollectionsInJava {

	public static void main(String[] args) {
		
		MyCollection mc = new MyCollection();
		
		Thread t1 = new Thread(mc);  //creating 2 threads on same object
		t1.start();
		
		Thread t2 = new Thread(mc);
		t2.start();
	}

}
