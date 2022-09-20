package prc.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayToObj {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		
		Object[] obj=al.toArray();
		
		for(Object o:obj) {
			int x=(Integer) o;
			System.out.println(x);
		}
	}
}
