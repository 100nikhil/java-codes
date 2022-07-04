package threadsinjava;


public class ThreadSynchronizeExample {

	public static void main(String[] args) {
		BankAccount task = new BankAccount();
		task.setBalance(100);
		
		//Both threads sharing single BankAccount object. That's why they will be sharing same resources.
		Thread john = new Thread(task);
		Thread anita = new Thread(task);	
		
		john.setName("John");
		anita.setName("Anita");
		
		john.start();
		anita.start();
		//System.out.println(Thread.activeCount());
	}
	
}

class BankAccount implements Runnable {
	private int balance;
	public void setBalance(int balance) {
		this.balance = balance;		
	}
	
	public void run() {
		makeWithdrawal(75);
		if (balance < 0) {
			System.out.println("Money overdrawn!!!");
		}
	}	

	synchronized private void makeWithdrawal(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + amount + " bucks");
	    } else {
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
	    }
	}
}