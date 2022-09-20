package problem1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		List<Product> al=new ArrayList<>();
		al.add(new Product(1,"shoes",2000,14));
		al.add(new Product(2,"tshirts",1000,9));
		al.add(new Product(3,"trousers",1500,6));
		al.add(new Product(4,"jacket",3000,18));
		al.add(new Product(6,"shorts",900,10));
		
		al.forEach(System.out::println);
		
		System.out.println("----------------------------------");
		
		Stream<Product> sp=al.stream();
		
		Stream<Product> sp2=sp.filter(pr->pr.getQuantity()>10);
		
		List<Product> filteredList=sp2.collect(Collectors.toList());
		
		filteredList.forEach(System.out::println);
		System.out.println("=================================");
		
		Comparator<Product> comp=Comparator.comparing(Product::getQuantity);
		
		Product maxQuant=al.stream().max(comp).get();
		
		System.out.println(maxQuant);
		
		
	}
}
