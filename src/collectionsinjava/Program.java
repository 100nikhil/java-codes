package collectionsinjava;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws CustomException{
		
		Scanner sc = new Scanner(System.in);
		
		try {
			if(sc.nextInt() < 10) {
				throw new CustomException("You can't enter number < 10");
			}
		}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This will be printed no matter what!");
			sc.close();
		}
	}

}

class CustomException extends Exception{

	private static final long serialVersionUID = 1L;

	public CustomException(String msg) {
		super(msg);
	}
}