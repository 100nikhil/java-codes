package oopsInJava;

/*
 * A class with keyword abstract infront of it is abstract.
 * This class can't be instantiated.
 * It may have constructor but of no use. Because can't instantiate.
 * An abstract class may not have any abstract method. (Ex: - Animals class below)
 * If a class has even single method as abstract we will have to declare it abstract.
 * We can only inherit an abstract class to use it.
 * 
 * */

abstract class Animals{
	void features() {
		System.out.println("Animals are living beings as well. Less intelligent than humans!");
	}
}

abstract class Human extends Animals{
	public Human() {
		//constructor is of no use | cause can't instantiate this class.
	}
	static void hello() {
		System.out.println("Hello from human!");
	}
	abstract void speak();
	void feature() {
		System.out.println("Humans are most intelligent living being on earth!");
	};
}

public class AbstractClassConcept extends Human{

	public static void main(String[] args) {
		hello(); //inherited static method.
		new AbstractClassConcept().speak();
		new AbstractClassConcept().feature();
		new AbstractClassConcept().features();
	}

	@Override
	void speak() {
		System.out.println("Hey I am a human being!");
	}

}
