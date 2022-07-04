package java8Features;

/*
 An Interface that contains exactly one abstract method is known as functional interface. 
 It can have any number of default, static methods but can contain only one abstract method. 
 It can also declare methods of object class.
 
 "default methods" was introduced by java 8 to solve backward compatibility problem :->
 
 Suppose we add new abstract methods to an interface & that interface is implemented by several classes
 Then all those classes will have to implement those new methods. otherwise application crashes.
 
 Default methods take away this headache, cause all classes implementing that interface will have the implementation
 of newly added default methods automatically.
 
 "static methods" was introduced in java 8 to increase cohesion in design.
 means all related methods at one place. We can call static methods of interface only by name of interface.
 
*/

@FunctionalInterface
interface Work{
	
	void work();
	
	default void task() {
		System.out.println("The task is done");
	}
	
	static void chores() {
		System.out.println("All chores all completed");
	}
	
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj); 
}

public class FunctionalInterfaceInJava implements Work{

	@Override
	public void work() {
		System.out.println("The work is done!");
	}

	public static void main(String[] args) {
		
		FunctionalInterfaceInJava fi = new FunctionalInterfaceInJava();
		
		fi.task();		//calling default
		Work.chores();  //calling static
		fi.work();
		
	}

}
