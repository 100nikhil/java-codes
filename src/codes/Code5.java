package codes;

public class Code5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a,b);
		System.out.println(a+" "+b);
		
		String s1 = "Java";
		String s2 = "Python";
		System.out.println("s1 and s2 : "+s1+"  "+s2);
		swap(s1, s2);
		System.out.println("s1 and s2 : "+s1+"  "+s2);
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	private static void swap(String a, String b) {
		
		System.out.println(a+" "+b);
		String temp = a;
		a = b;
		b = temp;
		System.out.println(a+" "+b);
	}

}
