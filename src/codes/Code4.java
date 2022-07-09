package codes;

public class Code4 {
	
	static void check() {
		try {
			String s = null;
			System.out.println("1");
			try {
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println("Inner");
			}
			
			System.out.println("2");
		}
		catch(NullPointerException e) {
			System.out.println("Outer");
		}
		System.out.println("3");
	}

	public static void main(String[] args) {
		check();
	}

}
