package assign1.p2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Queue<Product> pr=new PriorityQueue<>(new ProductPriceComp());
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of product");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter the name of product");
			String prName=sc.next();
			
			System.out.println("enter the product id");
			int prId=sc.nextInt();
			
			System.out.println("enter price of products");
			int price=sc.nextInt();
			
			pr.add(new Product(prId,prName,price));
			
		}
		
		Product p;
		
		while((p=pr.poll())!=null) {
			System.out.println(p);
		}
	}
}
