package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamApiInJava {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price < 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
		
		//-------------- reduce() ---------------
		Float totalPrice = productsList.stream().map(product -> product.price)
				.reduce(0.0f,(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); 
		System.out.println(totalPrice2);
		
		
		//--------Count ---------------------
        long count = productsList.stream()  
                .filter(product->product.price<30000)  
                .count();  
        System.out.println("No. of products with price < 30000 : "+count);
        
        long totalCount = productsList.stream().collect(Collectors.counting());
        System.out.println("No. of all products : "+totalCount);
        
        
        //------------------ Converting product List into Set -----------
        Set<Float> productPriceList =   
            productsList.stream()  
            .filter(product->product.price < 30000)   // filter product on the base of price  
            .map(product->product.price)  
            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
        System.out.println(productPriceList);  
        
        
        //----------------- max() method to get max Product price  -------------------------
        Product productA = productsList.stream().max(
        		(product1, product2)->product1.price > product2.price ? 1: -1)
        		.get();    
        System.out.println(productA.price);  
        
        
		
		// finding sum and average of all ids
		int idSum = productsList.stream().collect(Collectors.summingInt(p -> p.id));
		System.out.println(idSum);
		
		double avgId = productsList.stream().collect(Collectors.averagingInt(p -> p.id));
		System.out.println(avgId);
		
		
		//-------- Printing all products name using method reference
		productsList.stream().map(p -> p.name).forEach(System.out::println);
	}

}
