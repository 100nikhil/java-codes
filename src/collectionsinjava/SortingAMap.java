package collectionsinjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Human {

	int weight;
	int height;
	String[] languages;
	String nationality;

	public Human() {

	}

	public Human(int weight, int height, String[] languages, String nationality) {
		super();
		this.weight = weight;
		this.height = height;
		this.languages = languages;
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Human [weight=" + weight + ", height=" + height + ", languages=" + Arrays.toString(languages)
				+ ", nationality=" + nationality + "]";
	}

}

public class SortingAMap {

	public static void main(String[] args) {
		Map<String, Human> people = new HashMap<>();
		people.put("John", new Human(60, 173, new String[] { "English", "Spanish" }, "American"));
		people.put("Anamica", new Human(51, 163, new String[] { "English", "Hindi" }, "Indian"));
		people.put("Amit", new Human(80, 178, new String[] { "Hindi", "Desi" }, "Indian"));
		people.put("Fiona", new Human(65, 174, new String[] { "Brazilian", "Spanish" }, "Brazilian"));

		System.out.println(people);
		
		//sorting by key (Simply create a tree-map)
		Map<String, Human> sortedPeople = new TreeMap<>(people);
		System.out.println("-- sorted by key --");
		System.out.println(sortedPeople);
		
		//sorting by value (By heights of humans)
		List<Entry<String, Human>> peopleList = new ArrayList<Entry<String, Human>>(people.entrySet());
		//second argument of sort() is anonymous class implementing Comparator interface
		Collections.sort(peopleList, new Comparator<Entry<String, Human>>(){
					public int compare(Entry<String, Human> o1, Entry<String, Human> o2) {
						return (o1.getValue().height - o2.getValue().height);
					}
		});
		
		Map<String, Human> sortedMap = new LinkedHashMap<String, Human>(); //insertion order is preserved, cause using linked hashMap
		for(Entry<String,Human> e: peopleList) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		System.out.println("-- sorted by value (height of human) --");
		System.out.println(sortedMap);
	}

}
