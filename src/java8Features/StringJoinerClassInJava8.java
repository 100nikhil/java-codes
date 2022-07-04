package java8Features;

import java.util.StringJoiner;

public class StringJoinerClassInJava8 {

	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner(",","[","]");
		
		sj.add("Nikhil");
		sj.add("Nupur");
		sj.add("Nikita");
		sj.add("Nancy");
		
		System.out.println(sj);
		System.out.println(sj.length());
		System.out.println(sj.toString().charAt(2));
		
		StringJoiner sj1 = new StringJoiner(",","{","}") ;
		
		sj1.add("Sneha");
		sj1.add("Sara");
		sj1.add("Snuggy");
		
		System.out.println(sj1);
		System.out.println(sj1.length());
		System.out.println(sj1.toString().charAt(2));
		
		System.out.println(sj.merge(sj1));
	}
}
