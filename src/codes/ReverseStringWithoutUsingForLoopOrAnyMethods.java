package codes;

public class ReverseStringWithoutUsingForLoopOrAnyMethods {

	public static void main(String[] args) {
		String s = "NIKHIL";
		String rev = reverse(s);
		System.out.println(rev);
	}
	
	public static String reverse(String s){
		if(s.length()==0) {
			return "";
		}
		return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
	}

}
