package javaHot;

/**
 * 
 * final variable can only be assigned once
 * final variable when not initialized at time of declaration are called, empty final variable
 * 
 * empty final instance variable can only be initialized in constructor
 * empty static final instance variable can only be initialized in static block
 */

public class FinalVariable {
	
	final int finalInstanceVariable; //empty final instance variable can only be initialized in constructor
	final static int staticFinalInstanceVariable; //empty static final instance variable can only be initialized 
	//in constructor
	
	public FinalVariable() {
		this.finalInstanceVariable = 10;
	}
	
	static {
		staticFinalInstanceVariable = 20;
	}
	
	public static void main(String[] args) {
		
		final int finalLocalVariable;
		finalLocalVariable = 30;
		
		System.out.println(finalLocalVariable);
		
		System.out.println(staticFinalInstanceVariable);
		System.out.println(new FinalVariable().finalInstanceVariable);
	}

}
