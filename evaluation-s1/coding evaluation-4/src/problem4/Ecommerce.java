package problem4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	Product p1=new Product("Shoes",2000,"Adidas",12);
	Product p2=new Product("Ipad",100000,"Apple",2);
	Product p3=new Product("Ipad",100000,"Apple",4);
	Product p4=new Product("Shoes",4000,"Nike",4);
	Product p5=new Product("Shoes",2000,"Adidas",8);
	
	List<Product> productList=new ArrayList<>();
	
	public void addProductToList() {
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
	}
	
	public void showProduct() {
		System.out.println(productList);
	}
}
