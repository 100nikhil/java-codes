/*
 * StringBuilder is fast but not synchronized.
 * StringBuffer is thread safe & is synchronized.
*/
package stringsInJava;

class Class1 extends Thread{
	
	StringBuffer s1;
	
	public Class1(StringBuffer s1){
		this.s1 = s1;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			s1.append("A");
		}
	}
}

class Class2 extends Thread{
	
	StringBuilder s2;
	
	public Class2(StringBuilder s2){
		this.s2 = s2;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			s2.append("A");
		}
	}
}

public class StringBuilderVsStringBuffer{
		
	public static void main(String[] args) throws InterruptedException {
		StringBuffer s = new StringBuffer("");
		Class1[] class1ThreadsArray = new Class1[10];
		for(int i=0; i<10; i++) {
			class1ThreadsArray[i] = new Class1(s);  //same object passed to each object of Class1 or each thread.
		}
		for(int i=0; i<10; i++) {
			class1ThreadsArray[i].start();
		}
		for(int i=0; i<10; i++) {
			class1ThreadsArray[i].join();
		}
		System.out.println("StringBuffer Expected output 1000: "+s.length());
		//------------------------------------------------------
		
		StringBuilder s1 = new StringBuilder("");
		Class2[] class2ThreadsArray = new Class2[10];
		for(int i=0; i<10; i++) {
			class2ThreadsArray[i] = new Class2(s1);  //same object passed to each object of Class2 or each thread.
		}
		for(int i=0; i<10; i++) {
			class2ThreadsArray[i].start();
		}
		for(int i=0; i<10; i++) {
			class2ThreadsArray[i].join();
		}
		System.out.println("StringBuilder Expected output 1000: "+s1.length());
		//here result may vary cause multiple threads may access append method simultaneously on StringBuilder obj
	}

}
