package collectionsinjava;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapsInJava1 {

	public static void main(String[] args) {
		//String spacing;
		Map<String, String> countriesCapitals = new TreeMap<>();
		countriesCapitals.put("India", "Delhi");
		countriesCapitals.put("USA", "Washington DC");
		countriesCapitals.put("China", "Beijing");
		countriesCapitals.put("Japan", "Tokyo");
		countriesCapitals.put("Australia", "Canberra");
		countriesCapitals.put("France", "Paris");
		countriesCapitals.put("Brazil", "Rio");
		countriesCapitals.put("England", "London");
		countriesCapitals.put("Russia", "Moscow");
		countriesCapitals.put("Thailand", "Bangkok");
		
		System.out.println(countriesCapitals);
		System.out.println(countriesCapitals.entrySet());    //return set
		System.out.println(countriesCapitals.keySet());
		System.out.println(countriesCapitals.values());
		Set<Entry<String, String>> set = countriesCapitals.entrySet();
		for(Entry<String, String> e: set) {
//			spacing = "";
//			for(int i=0; i<(10-e.getKey().length()); i++) {
//				spacing += " ";
//			}
//			System.out.println(e.getKey()+spacing+": "+e.getValue());
			
			//Shorter way for padding to fixed length. Ex: padding right side to 10 in below 
			System.out.println(String.format("%"+(-10)+"s", e.getKey())+": "+e.getValue());
		}
		System.out.println(String.format("%x", 101));  //coverting to hexadecimal. 6*16^1 + 5*16^0 = 96+5 = 101
		System.out.println(String.format("%o", 101));  //coverting to octadecimal
	}

}
