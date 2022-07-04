package java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

@FunctionalInterface
interface Player {
	void play();
}

public class LambdaExpressionsInJava {

	public static void main(String[] args) {
		
		// using lambda expression to implement Player interface method
		Player p = () -> {
			System.out.println("I am playing football");
		};

		p.play();

		
		// Lambda expressions used heavily with stream API
		
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(1, "Jenny", 30000));
		emps.add(new Employee(2, "John", 35000));
		emps.add(new Employee(3, "Hailey", 20000));
		emps.add(new Employee(4, "Smith", 40000));
		emps.add(new Employee(5, "Admond", 40000));
		emps.add(new Employee(6, "Amit", 35000));
		emps.add(new Employee(7, "Amit", 35000));
		
		List<Employee> emp1 = emps.stream().filter((e) -> e.salary<35000).collect(Collectors.toList());
		//emp1 has all employees with salary < 35000
		emp1.stream().forEach((e) -> {System.out.println(e.name);});
		//emp1.stream().map(e -> e.name).forEach(System.out::println);   //using method-reference
		
		emp1.stream().map(e -> e.name+" have salary < 35000").forEach(System.out::println);
		
		double t = emps.stream().map(e -> e.salary).reduce(0.0, (x, e) -> x+e);
		System.out.println("Total salary of all employees is : "+t);
		
		//sorting emps by salary desc, then name, then id
		Collections.sort(emps, Comparator.comparing(Employee::getSalary).reversed()
				.thenComparing(Employee::getName).thenComparing(Employee::getId));
		
		emps.forEach(e -> {System.out.println(e.id+" "+e.name+" "+e.salary);});
		
		//-----------
		List<Integer> x = new ArrayList<>();
		x.add(10);
		x.add(7);
		x.add(50);
		x.add(20);
		
		System.out.println(Collections.max(x));  //min of collection
		System.out.println(Collections.min(x));  //max of collection
		System.out.println(x);
		Collections.swap(x, 0, 2);  //swap index values
		System.out.println(x);
		Collections.reverse(x);  //reverse the collection
		System.out.println(x);
		Collections.fill(x, 100);
		System.out.println(x);
	}

}
