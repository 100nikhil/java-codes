package javaHot;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class RandomClass implements Cloneable{
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public RandomClass() {
		System.out.println("RandomClass constructor called.");
	}
	
	public void hello() {
		System.out.println("Hello from RandomClass");
	}
}

public class WaysToCreateObjectInJava {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*
		 * There are several ways to create object in java
		 */
		
		// 1. Using new keyword 
		RandomClass rc1 = new RandomClass();
		rc1.hello();
		System.out.println("---");
		
		// 2. Using newInstance() of java.lang.class
		Class<?> c = Class.forName("javaHot.RandomClass");
		RandomClass rc2 = (RandomClass)c.newInstance();
		rc2.hello();
		System.out.println("---");
		
		// 3. Using clone (Here created object is copied so constructor not called)
		RandomClass rc3 = (RandomClass)rc1.clone();
		rc3.hello();
		System.out.println("---");
		
		// 4. Using newInstance() of java.lang.reflect.Constructor
		Constructor<RandomClass> constructor = RandomClass.class.getConstructor();
		RandomClass rc4 = constructor.newInstance();
		rc4.hello();
		System.out.println("---");
		
		// 5. By using deserialization 
		// Whenever we serialize and then deserialize an object, JVM creates a separate object. 
	}

}
