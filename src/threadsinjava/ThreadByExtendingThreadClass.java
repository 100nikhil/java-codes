package threadsinjava;

public class ThreadByExtendingThreadClass extends Thread{

	public void run() {
		System.out.println("Inside the run...");
		for(int i=0; i<10; i++) {
			System.out.println("t "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside the main() method");
		for(int i=0; i<10; i++) {
			System.out.println("Main "+i);
			Thread.sleep(500);
		}
		new ThreadByExtendingThreadClass().start();
		new ThreadByExtendingThreadClass().start();
	}

}
