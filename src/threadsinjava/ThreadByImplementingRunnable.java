package threadsinjava;

public class ThreadByImplementingRunnable implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Inside the main()");
		ThreadByImplementingRunnable tr = new ThreadByImplementingRunnable();
		//Thread tr1 = new Thread(tr);
		for(int i=0; i<3; i++) {
			System.out.println("main "+i);
			tr.run();
//			tr1.start();
//			tr1.join();
			Thread.sleep(500);
		}
	}

	@Override
	public void run() {
		System.out.println("Inside the run()");
		for(int i=0; i<3; i++) {
			System.out.println("t "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
