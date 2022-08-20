package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Author{
	
	String name;
	int id;
	
	Author(String n, int id){
		this.name = n;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.id;
	}
}

public class Code3 {

	public static void main(String[] args) {
		
		List<Author> authors = new ArrayList<>();
		authors.add(new Author("nick", 1));
		authors.add(new Author("John", 3));
		authors.add(new Author("Hanna", 2));
		
		Collections.sort(authors, (Author a1, Author a2) -> a1.name.compareTo(a2.name));
		
		System.out.println(authors);
	}

}
