package javaHot;

//NOTE: You can only call one constructor of parent class from child class constructor

class Parent{
    protected int num = 1;
    
    Parent(){
        System.out.println("Parent class default constructor.");
    }
    
    Parent(String x){
        System.out.println("Parent class parameterised constructor.");
    }
    
    public void foo(){
        System.out.println("Parent class foo!");
    }
}

public class SuperKeyword extends Parent{

	private int num = 2;
 
	SuperKeyword(){
		super();    // to call default parent constructor
		//super("Call Parent");    // to call parameterised constructor.
		
        System.out.println("Child class default Constructor");
        
    }
    
    void printNum(){
        System.out.println(num);
        System.out.println(super.num); //prints the value of num of parent class
    }
    
    @Override
    public void foo(){
        System.out.println("Child class foo!");
        super.foo();    //Calls foo method of Parent class inside the Overriden foo method of Child class.
    }
    
    public static void main(String[] args) {
		Parent p = new SuperKeyword();
		System.out.println(p.num);
		p.foo();
		
		SuperKeyword s = new SuperKeyword();
		s.printNum();
	}

}

