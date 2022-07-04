package java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class NewDateTimeApiInJava8 {

	public static void main(String[] args) {
		
		// LocalDate is immutable and thread safe
		
		LocalDate ld = LocalDate.now();  
		
		System.out.println(ld);
		System.out.println(ld.getDayOfWeek());	//week's which day it is
		System.out.println(ld.getDayOfMonth()); //month's which day it is
		System.out.println(ld.getDayOfYear());	//year's which day it is
		
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.lengthOfMonth());
		
		System.out.println(ld.isLeapYear());
		System.out.println(ld.lengthOfYear());
		
		System.out.println(ld);
		System.out.println(ld.minusDays(3));    //return LocalDate 3 days before
		System.out.println(ld.minusMonths(1));
		System.out.println(ld.minusWeeks(1));
		System.out.println(ld.minusYears(1));
		
		System.out.println("---------------------");
		
		LocalDate ld1 = LocalDate.parse("2020-03-23");
		System.out.println(ld1);
		System.out.println(ld1.getDayOfWeek());
		System.out.println(ld1.isLeapYear());
		System.out.println(ld1.lengthOfYear());
		
		System.out.println("---------------------");
		
		LocalDate ld3 = LocalDate.parse("02/05/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(ld3);
		
		System.out.println("---------------------");
		
		LocalDate ld2 = LocalDate.of(2022, 1, 1);
		System.out.println(ld2);
		System.out.println(ld2.getYear()+"/"+ld2.getMonthValue()+"/"+ld2.getDayOfMonth());
		System.out.println(ld2.getDayOfMonth()+" "+ld2.getMonth()+" "+ld2.getYear());
		
		System.out.println("-----------------------------------------");
		
		
		//LocalTime is immutable and implements comparable interface
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
	    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
	    LocalTime time1 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time1);  
	    LocalTime time2 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time2); 
	    
		System.out.println("-----------------------------------------");
		
		
		//LocalDateTime
		
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(1996,10,20,5,13,1).getDayOfWeek());
		
	}

}
