package threadsinjava;

//static synchronized - When static method is synchronized then thread aquire the class-level-LOCK
// useful when 'multiple objects' of that class is created and objects come with it's own threads
// to access class method then normal synchronization won't work. Cause they are different objects so object 
// level lock won't work. And the ordering may differ as all threads can access the method simultaneously.
// That's why we need class level lock.

//Class level lock means -> "Lock on all the "static synchronized" methods of that class"
//static methods, instance methods, synchronized instance methods will be FREE

class Display
{
	
	//class level-lock will be aquired which ever thread enters this method.
	//if we remove static keyword, then both threads will access wish() method simultaneously
	//because it will be a synchronized instance method.
	public static synchronized void wish(String name)  
	{
		for(int i=0;i<3;i++)
		{
			System.out.print("Good Morning: ");
			System.out.println(name);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	
}

class MyThread1 extends Thread{
	Display d;
	String name;
	MyThread1(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class StaticSynchronization {

	public static void main(String[] args)
	{
		Display d1=new Display();         //We are creating two different objects. So object level lock fails.
		Display d2=new Display();
		MyThread1 t1=new MyThread1(d1,"Sehwag");
		MyThread1 t2=new MyThread1(d2,"Sachin");
		t1.start();
		t2.start();
	}

}
