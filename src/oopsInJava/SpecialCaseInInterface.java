package oopsInJava;

interface LivingThing{
	
	void something();
	
	void hello();
	
	default void alive() {
		System.out.println("All living things are alive");
	}
	static void breath() {
		System.out.println("Living things breath oxygen");
	}
}

interface LivingThing2{
	
	void something();
	
	default void alive() {
		System.out.println("All plants are alive");
	}
	static void breath() {
		System.out.println("Most plants breath CO2");
	}
}


public class SpecialCaseInInterface implements LivingThing, LivingThing2{

	public static void main(String[] args) {
		LivingThing l = new SpecialCaseInInterface();
		LivingThing2 l2 = new SpecialCaseInInterface();
		SpecialCaseInInterface s = new SpecialCaseInInterface();
		
		l.alive();
		l2.alive();
		s.alive();
		
		System.out.println("----------");
		
		l.something();
		l2.something();
		s.something();
		
		System.out.println("----------");
		
		LivingThing.breath();
		LivingThing2.breath();
		
		System.out.println("----------");
		
		l.hello();
		//l2.hello();   //throw error cause l2 is reference variable of LivingThing2 
		s.hello();
		
	}
	
	//Because we have two default methods of same name that's why we have to override that method
	@Override
	public void alive() {
		LivingThing.super.alive(); 
		LivingThing2.super.alive();  
	}

	@Override
	public void something() {
		System.out.println("abstract method called!");
	}

	@Override
	public void hello() {
		System.out.println("Hello from LivingThing interface");
	}

}
