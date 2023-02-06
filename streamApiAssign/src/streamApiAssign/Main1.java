package streamApiAssign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nuber of elements in the lists");
		int num=sc.nextInt();
		List<Integer> numbers = new ArrayList<>();
		while(num-->0) {
			System.out.println("enter the "+num+"element");
			int x=sc.nextInt();
			numbers.add(x);
		}
		
		List<Integer> resultList = numbers.stream().filter(n -> n%2==0 && n>=10).collect(Collectors.toList());
		List<Integer> oddList =numbers.stream().filter(n-> n%2==1).collect(Collectors.toList());
		List<Integer> newList=numbers.stream().filter(n-> n%2==0 && n%4==0).collect(Collectors.toList());
		System.out.println("even List divisible by 2 and 4 "+newList);
		System.out.println("even List "+ resultList);
		System.out.println("OddList "+ oddList);

	}

}
