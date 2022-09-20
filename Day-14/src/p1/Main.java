package p1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Object> al=new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(null);
		al.add(null);
		al.add(36);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("--------------------------------");
		for(Object o:al) {
			System.out.println(o);
		}
	}
}
