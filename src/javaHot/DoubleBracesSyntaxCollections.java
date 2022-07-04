package javaHot;

import java.util.HashSet;
import java.util.Set;

public class DoubleBracesSyntaxCollections {

	static Set<String> set = new HashSet<String>() 
	{ //first brace is for anonymous inner class
		{  //second for initialization
			add("John");
			add("Jennifer");
			add("Jenny");
		}
	};
	
	public static void main(String[] args) {
		set.stream().forEach(System.out::println);
	}

}
