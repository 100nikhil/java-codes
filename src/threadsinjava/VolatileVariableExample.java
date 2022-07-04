package threadsinjava;
import java.util.concurrent.TimeUnit;
/*
 * Volatile variable guarantees memory visibility.
 * It is useful only when one thread writes and another thread reads.
 * As in Example: one thread write "stop" and another reads "stop"
 * 
 * whenever first thread writes the "stop" value. Another thread will get latest updated value.
 * 
 * Synchronized ensure both memory visibility and atomicity.
 *
*/


public class VolatileVariableExample {

	private static volatile boolean stop;

	public static void main(String[] args) throws InterruptedException {
		new Thread(new Runnable() {  //here we passed anonymous class implementing runnable
			public void run() {
				while (!stop) {
					System.out.println("In while ...");
				}
				System.out.println("Out of while ........ ");
			}
		}).start();

		//Thread.sleep(1000);
		TimeUnit.SECONDS.sleep(1);   //same as Thread.sleep(1000);
		stop = true;
	}
}
