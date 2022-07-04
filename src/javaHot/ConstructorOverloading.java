package javaHot;

import java.time.LocalDate;

public class ConstructorOverloading {

	String name;
	LocalDate dob;

	public ConstructorOverloading() {
		System.out.println("Default Constructor called");
	}

	// parameterized with two args
	public ConstructorOverloading(String n, LocalDate dob) {
		this.name = n;
		this.dob = dob;
		System.out.println("ConstructorOverloading(String n, LocalDate dob) called");
	}

	// parameterized with 2 args but different order
	public ConstructorOverloading(LocalDate dob, String n) {
		this.name = n;
		this.dob = dob;
		System.out.println("ConstructorOverloading(LocalDate dob, String n) called");
	}

	// parameterized with one arg
	public ConstructorOverloading(String n) {
		this.name = n;
		System.out.println("ConstructorOverloading(String n) called");
	}

	@Override
	public String toString() {
		return "ConstructorOverloading [name=" + name + ", dob=" + dob + "]";
	}

	public static void main(String[] args) {
		ConstructorOverloading c1 =  new ConstructorOverloading();
		ConstructorOverloading c2 =  new ConstructorOverloading("John", LocalDate.of(2000, 6, 1));
		ConstructorOverloading c3 =  new ConstructorOverloading(LocalDate.of(1997, 10, 5), "Jenny");
		ConstructorOverloading c4 =  new ConstructorOverloading("Azgar zurraat");
		
		System.out.println("-------------------");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
	}

}
