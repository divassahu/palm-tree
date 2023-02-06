package streamApiAssign;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ObjectToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<People> peopleList=new ArrayList<>();
		
		People p1=new People("Ramu",91);
		People p2=new People("Shyamu", 54);
		People p3=new People("Gyanu",67);
		
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		
		Map<String,Integer> result= peopleList.stream().collect(Collectors.toMap(People::getName,People::getAge));
		for(Map.Entry<String, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
		System.out.println(result);
		
		long count= peopleList.stream().count();
		
		System.out.println("the number of element are "+ count);
		
		List<People> sortedList=peopleList.stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
		
		System.out.println("sorted list according to age "+sortedList);
		
		
		
		
		

	}

}
