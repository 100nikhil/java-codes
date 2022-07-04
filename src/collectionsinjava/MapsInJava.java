package collectionsinjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

//Map interface do not extends Collection interface. It is separate.
/*
 * 					Map(I)--------------
 * 					  |				   |
 * 					/	\			   |
 * 			  HashMap	HashTable	 SortedMap(I)
 * 				|						|
 * 		 LinkedHashMap				  TreeMap	
 * 
*/

public class MapsInJava {

	public static void main(String[] args) {
		NavigableMap<String, Integer> playerScores = new TreeMap<String, Integer>();  //keeps in sorted key order
		playerScores.put("Kohli", 100);
		playerScores.put("Sachin", 200);
		playerScores.put("Sehwag", 300);
		playerScores.put("A B Deviliers", 150);
		
		System.out.println(playerScores);
		System.out.println(playerScores.ceilingKey("Sachin"));
		System.out.println(playerScores.containsKey("Sehwag"));
		System.out.println(playerScores.containsValue(100));
		System.out.println(playerScores.lastKey());
		System.out.println(playerScores.firstKey());
		System.out.println(playerScores.higherKey("Kohli"));
		System.out.println(playerScores.putIfAbsent("Sehwag", 309)); //put this key value pair if key is absent
		playerScores.merge("Sehwag", 309, (v1, v2) -> v2);
		System.out.println(playerScores);
		
		Map<String, Double> productsPrices = new HashMap<String, Double>(); //do not maintain insertion order
		productsPrices.put("Addidas Shoes", 5012.45);
		productsPrices.put("Boat Speakers", 999.00);
		productsPrices.put("Maono condensor mic", 2023.19);
		productsPrices.put("Infinix Mobile", 10200.25);
		productsPrices.put("Badminton Net", 250.40);
		
		System.out.println(productsPrices);
		
		Map<String, Double> productsPrices2 = new LinkedHashMap<String, Double>(); //Maintain insertion order
		productsPrices2.put("Addidas Shoes", 5012.45);
		productsPrices2.put("Boat Speakers", 999.00);
		productsPrices2.put("Maono condensor mic", 2023.19);
		productsPrices2.put("Infinix Mobile", 10200.25);
		productsPrices2.put("Badminton Net", 250.40);
		
		System.out.println(productsPrices2);
	}

}
