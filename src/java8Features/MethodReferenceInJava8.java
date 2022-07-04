package java8Features;

import java.util.function.BiFunction;

class Arithmetic{  
	public static int add(int a, int b){  
		return a+b;  
	}  
	public static float add(int a, float b){  
		return a+b;  
	}  
	public float add(float a, float b){  
		return a+b;  
	}  
} 

@FunctionalInterface
interface Sayable{  
    void say();  
} 

class Sayable1{
	public Sayable1() {
		System.out.println("Saying something from constructor of Sayable1 class");
	}
}

public class MethodReferenceInJava8 {
	
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    } 
    
    public static void main(String[] args) {  
        
    	// Referring static method, now say() method of Sayable-interface will refer to saySomething() ---->
        Sayable sayable = MethodReferenceInJava8::saySomething;   
        //Sayable sayable = new MethodReferenceInJava8()::saySomething;   //if saySomthing() is not static
        sayable.say();
        
        //Referring instance method, We can by creating object ------>
        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = new Arithmetic()::add; //referring to instance method
        
        int result1 = adder1.apply(10, 20);  
        float result2 = adder2.apply(10, 20.0f);  
        float result3 = adder3.apply(10.0f, 20.0f);  
        System.out.println(result1);  
        System.out.println(result2);  
        System.out.println(result3);
        
        
        //Reference to constructor
        Sayable sayable1 = Sayable1::new;
        sayable1.say();
        
    } 

}
