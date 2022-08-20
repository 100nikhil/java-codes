package codingProblem;

public class PallindromeCheck {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abbczcbba");
		if(sb.toString().equals(sb.reverse().toString())) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
		int hashValue = Integer.hashCode(10212);
        System.out.println("Hash code Value for object is: " +hashValue); 
	}

}
