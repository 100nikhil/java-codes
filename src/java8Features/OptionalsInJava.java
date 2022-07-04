package java8Features;

import java.util.Optional;

/*
	Optional is a class that handles the null values.
	It was introduced in java 1.8 or JAVA 8
*/
public class OptionalsInJava {

	public static void main(String[] args) {
		String[] arr = new String[10];
		arr[0] = "Sehwag is most destructive player in the cricket ever";
		Optional<String> s = Optional.ofNullable(arr[5]);
		Optional<String> s1 = Optional.ofNullable(arr[0]);
		
		if(s.isPresent()) {
			System.out.println(s.get());
		}
		else {
			System.out.println("It is null value");
		}
		
		if(s1.isPresent()) {
			System.out.println(s1.get());
		}
		
		//another syntax of ifPresent()
		s1.ifPresent(System.out::println);
		
		//orElse
		System.out.println(s.orElse("If value not present I will be printed"));
	}

}
