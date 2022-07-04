package javaHot;

public class StaticContext {
	
	String day;  //this is instance variable
	
	//NOTE: Local variable is created inside block, function or constructor
	
	StaticContext(String day){   //here the argument var -> day is local variable
		this.day = day;
	}
	
	//overriding equals() method, if day string value is equal then returning true, else false.
	@Override
	public boolean equals(Object obj) {
		String v1 = this.day;
		StaticContext o = (StaticContext)obj;
		String v2 = o.day;
		
		return v1.equals(v2);
		
	}
	
	public void func() {
		System.out.println("func() called!");
	}
	public static void func1() {
		System.out.println("fucn1() static method called!");
		//func(); not possible to call
	}
	public void func2() {
		System.out.println("fucn2() called!");
		func1();   //from instance method we can call both static and instance methods
		func();   
	}
	
	public static void main(String[] args) {
		func1();
//		func();    //from static context we can directly call static methods only
		
		StaticContext sc = new StaticContext("Sunday");
		StaticContext sc1 = new StaticContext("Monday");
		sc.func2();
		System.out.println(sc==sc1);   //checks address or reference
		System.out.println(sc.equals(sc1));
	}

}
