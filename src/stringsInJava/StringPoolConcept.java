package stringsInJava;

/*
 * String pool is area in heap memory used to store strings efficiently
 * 
 * If we create a new string jvm checks if that string present in String constant pool. If found it just returns sets
 * the reference to that string.
 * 
 * String a = "java"; 
 * String b = "java";
 * 
 * a & b both refer to same object in memory or same string in string constant pool. So only one object is created
 * here.
 * 
 * If we create using new String() , Then new object is created every time in heap memory
 * 
 * if we call intern() , It forcefully stop the behaviour of new String(), and add the object in string constant pool
 * or set the reference to already present string in string constant pool.
 * 
 * When the intern method is invoked, if the pool already contains a string equal to this String object as determined 
 * by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to 
 * the pool and a reference to this String object is returned. 
 * 
*/

public class StringPoolConcept {

	public static void main(String[] args) {
		String s1 = "java";     //new object created in SCP
		String s2 = "java";		//new object is NOT created, refers to object already present in SCP, created by s1
		String s3 = new String("java");  //new object created in heap
		String s4 = new String("java").intern();  //new object NOT created refers to object already present in SCP, created by s1
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		//So total 2 objects are created by this program
	}

}
