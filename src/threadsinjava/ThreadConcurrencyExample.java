package threadsinjava;

import java.lang.management.ManagementFactory;

public class ThreadConcurrencyExample extends Thread {

	static int num;

	public void run() {
		try {
			calculate();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void calculate() throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.println("Calculate : " + num++);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadConcurrencyExample t = new ThreadConcurrencyExample();
		t.start();
		for (int i = 0; i < 10; i++) {
			Thread.sleep(500);
			System.out.println("Main : " + num++);
		}
		
		//To get all running threads including gc, jvm threads etc.
		System.out.println("Total Number of threads " + ManagementFactory.getThreadMXBean().getThreadCount());
		
		//To get no. of threads in current thread's thread group
		System.out.println("Total Number of threads in current thread's group " + Thread.activeCount());
	}

}
