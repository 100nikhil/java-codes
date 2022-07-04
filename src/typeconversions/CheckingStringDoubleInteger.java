package typeconversions;

public class CheckingStringDoubleInteger {
	
	public static void counts(String sentence) {
		//String arr = sentence.replaceAll("^\\s+","");  //remove all leading spaces
		//String arr = sentence.replaceAll("\\s+$","");  //remove all trailing spaces
		
		String str = sentence.trim();  //remove both leading and trailing spaces
		String[] arr = str.split("\\s+");
		System.out.println(arr.length);
		
		int inn = 0;
		int s = 0;
		int d = 0;
		
		for(int i=0; i<arr.length; i++) {
			//one approach
			try {
				Integer.parseInt(arr[i]);
				inn++;
			}
			catch(Exception e) {
				try {
					Double.parseDouble(arr[i]);
					d++;
				}
				catch(Exception e1) {
					s++;
				}
			}
			
//			---- Second Approach ----				
//			if(arr[i].matches("[a-z]+")) {
//				s++;
//			}
//			else if(arr[i].matches("[0-9]+")) {
//				inn++;
//			}
//			else {
//				d++;
//			}
		}
		System.out.println("string "+s);
		System.out.println("integer "+inn);
		System.out.println("double "+d);
	}
	
	public static void main(String[] args) {
		String str = "  ajs 0 12.23 119 222 10 hello i am not   a goon   or a goblin 1.212 .222 21212  ";
		counts(str);
	}

}
