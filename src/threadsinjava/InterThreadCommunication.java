package threadsinjava;

/*
 * wait(), notify(), notifyAll() are present in java.lang.object class. These are used for inter-thread 
 * communication. wait() push the current thread to waiting state. and releases the lock of the object
 * on which it is called.
 * 
 * then another thread who is waiting to aquire the lock on that same object will aquire the lock and do
 * its work. Now this second thread will notify() thread who went to waiting state. That I am done now
 * you can aquire the lock again.
 * 
 * notifyAll() will notify all the threads waiting for that object's lock.
 * 
 * wait(), notify(), notifyAll() can only be called from inside the synchronized() area.
 * cause a lock on the object is mandatory to call these methods.
*/

public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		
		Human human = new Human("Sakshi", 26);
		Thread t1 = new Thread(new MyThread(human));
		t1.start();
		
		synchronized(human) {
			System.out.println(human);
			System.out.println("Main thread going to wait!");
			human.wait();   //lock on human object is released
			
			System.out.println("Main thread is notified!");
			System.out.println(human);
		}
		
	}

}

class MyThread implements Runnable{
	
	private Human human;
	
	public MyThread(Human h) {
		this.human = h;
	}
	
	@Override
	public void run(){
		synchronized(human) {
			System.out.println("MyThread thread sleeping for 3 sec!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			human.setName("Sakshi Sharma");
			human.setAge(21);
			human.notify();   //lock released and main thread is notified. That he can work with human object now
		}
	}
	
}

class Human {
	String name;
	int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

}
