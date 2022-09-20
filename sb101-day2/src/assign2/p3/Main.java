package assign2.p3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
		System.out.println("enter the no of entries");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("enter key as state");
			String st=sc.next();
			System.out.println("enter capital as value");
			String cap=sc.next();
			
			lhm.put(st, cap);
		}
		
		for(Map.Entry<String, String> me:lhm.entrySet()) {
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}
