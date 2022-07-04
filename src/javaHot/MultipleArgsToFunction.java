package javaHot;

public class MultipleArgsToFunction {
	
	// ... is a way to accept varying no. of arguments, When we don't know how many args will be passed
    static void multipleArgsMethod(String... arr) {  
    	for(String s: arr) {
    		System.out.print(s+" ");
    	}
    	System.out.println();
    }
	
	public static void main(String[] args) {
		multipleArgsMethod("He", "is", "not", "a", "God");
		multipleArgsMethod("He", "is", "Fraud");
		multipleArgsMethod(new String[] {"I", "am", "Human"});
	}

}
