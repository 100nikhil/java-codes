package codes;

public class Code2 {

	public static void main(String[] args) {
		Code1 c1 = new Code1();
		Code1 c2 = new Code1();
		Code1 c3 = c1;
		
		System.out.println(c1==c3);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}

}
