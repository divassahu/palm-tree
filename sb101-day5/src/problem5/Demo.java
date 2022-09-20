package problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Product> pr = new ArrayList<>();
		pr.add(new Product(22,"Shoes",10,1990));
		pr.add(new Product(202,"Shorts",35,990));
		pr.add(new Product(12,"Shirts",13,1490));
		pr.add(new Product(32,"Trousers",5,1190));
		pr.add(new Product(42,"SportsShoes",12,2990));
		pr.add(new Product(31,"Shocks",8,90));
		
		Collections.sort(pr,(o1,o2)->(o1.getPrice()>o2.getPrice()?-1:1));
		
		pr.forEach(System.out::println);
		
	}
}
