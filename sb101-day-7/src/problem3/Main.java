package problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(8,3,2,4,5);
		
		Stream<Integer> si=nums.stream();
		
		List<Integer> numsSqr=si.map(x-> x*x).collect(Collectors.toList());
		
		numsSqr.forEach(System.out::println);
		System.out.println("************************");
		
		nums.forEach(System.out::println);
	}
}
