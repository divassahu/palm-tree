package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
	//Predicate//
	
	public static void main(String[]args) {
		
		List<Student> std=new ArrayList<>();
		std.add(new Student(2,"n1",67));
		std.add(new Student(5,"n2",34));
		std.add(new Student(3,"n3",65));
		std.add(new Student(4,"n4",95));
		std.add(new Student(6,"n5",46));
		
		std.removeIf(i->i.getMarks()<50);
		std.forEach(System.out::println);
		
	//Consumer
		
		List<String> city=Arrays.asList("Mumbai","Haridwar","Dehradoon","Rishikesh");
		
		city.forEach(System.out::println);
		
	//Supplier
		
		Supplier<Employee> emp=()->new Employee(10,"vokes",600000);
		
		System.out.println(emp.get().getName());
		
	//Function
		
		Function<Integer,Integer> fun= i-> i*i;
		System.out.println(fun.apply(6));
		
		Function<Employee,String> fun2=x->x.getName()+" Hello";
		System.out.println(fun2.apply(new Employee(101317,"ups",109099)));
		
	}
	
}
