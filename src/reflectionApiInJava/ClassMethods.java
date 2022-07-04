package reflectionApiInJava;

import java.lang.reflect.Method;

class Parent {
	void hello() {
		System.out.println("This is the parent class.");
	}
}

class Child extends Parent {

	public Child() {
		System.out.println("Child's constructor!!!");
	}

	void hello1() {
		System.out.println("This is the child class.");
	}

}

public class ClassMethods {

	public static void main(String[] args) {
		Child c = new Child();
		c.hello1();
		/*
		 * Reflection API
		 */
		Class<? extends Child> myClass = c.getClass();
		System.out.println(myClass.getName());
		System.out.println(myClass.getTypeName());
		System.out.println(myClass.getSimpleName());
		System.out.println(myClass.getCanonicalName());
		System.out.println(myClass.getPackage());
		System.out.println(myClass.getSuperclass());
		System.out.println(myClass.getModifiers());

		Method[] methods = myClass.getMethods();
		System.out.println("-> " + methods[0]);
		System.out.println("-> " + methods[1]);
		System.out.println("-> " + methods[2]);
		System.out.println("-> " + methods[3]);
		System.out.println("-> " + methods[4]);
		System.out.println("-> " + methods[5]);
		System.out.println("-> " + methods[6]);
		System.out.println("-> " + methods[7]);
		System.out.println("-> " + methods[8]);
		
	}

}
