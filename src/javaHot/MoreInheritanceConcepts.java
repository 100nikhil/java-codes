package javaHot;

class Top{
	
	String t;
	
	Top(String t1){
		this.t = t1;
		System.out.println("Passed string is : "+this.t);
	}
	
	public void method() {
		System.out.println("Top class method() called!");
	}
	
}

public class MoreInheritanceConcepts extends Top{

	public MoreInheritanceConcepts() {
		super("okay");  //Note: if we don't call super(String s) here program will throw error
		
		//because it is compulsory to call parent class constructor from child class constructor while inheriting
		//suppose Top (parent class) don't have any constructor then JVM will define a default constructor 
		//automatically, and will also call it automatically by adding super() in child class constructor implicitly
		
		//But because we have defined a parameterized constructor by ourself, So compiler will not define
		//a default constructor, So it is an obligation now that we have to call parent class parameterized constructor
		
		//Call to super() must be first statement in Derived(Student) Class constructor.
		System.out.println("MoreInheritanceConcepts() constructor called!");
	}
	
	public static void main(String[] args) {
		new MoreInheritanceConcepts();
	}

}
