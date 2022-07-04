package oopsInJava;
/*
 * Interface are very useful:
 *   -It is used to achieve total abstraction.
 *   -Since java does not support multiple inheritances in the case of class,
 *    by using an interface it can achieve multiple inheritances.
 *   -It is also used to achieve loose coupling. 
 *   
 *   - All interface variables are public, static and final
 *   - Interface methods are by default abstract and public.
 * */


interface Teacher{
	String age_range = "Age can be between 20-60 years"; //public static final by default.

	void teach();  //public and abstract by default
	
	double calculateSquareRoot(int num);  //public and abstract by default.
	
	default void hello() {
		//default methods introduced to solve problem that new methods can be added to interfaces without
		//affecting the code of all classes that implement that interface. (Because it's not necessary to
		// override the default method of interface)
		//Since java8 you can have default methods. With default keyword. But you have to give method body.
		System.out.println("Hello from teacher!"); 
	}
	
	static void activity() {
		//same as static methods in class. Can be called on Interface Name
		System.out.println("Teacher is writing on the board!");
	}	
}

public class InterfaceConceptInJava implements Teacher{
	
	public static void main(String[] args) {
		 InterfaceConceptInJava obj = new InterfaceConceptInJava();
		 System.out.println(obj.calculateSquareRoot(25));
		 obj.teach();
		 obj.hello();
		 Teacher.activity();
		 System.out.println(Teacher.age_range);
	}

	@Override
	public void teach() {
		System.out.println("Teacher is teaching!");
	}

	@Override
	public double calculateSquareRoot(int num) {
		return Math.sqrt(num);
	}
}	
