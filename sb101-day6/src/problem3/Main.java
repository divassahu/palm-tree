package problem3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>originalMap){
		LinkedHashMap<String,Student> lhm=originalMap.entrySet().stream()
											 .sorted(Map.Entry.comparingByValue((s1,s2)->s1.getMarks()>s2.getMarks()?1:-1))
											 .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->v1,LinkedHashMap::new));
		return lhm;
	}
	public static void main(String[] args) {
		Map<String,Student> originalMap=new HashMap<>();
		originalMap.put("USA", new Student(2,"Albert",657,"acs@email"));
		originalMap.put("UK", new Student(3,"Alex",879,"vcb@pmail"));
		originalMap.put("Australia", new Student(4,"Ross",567,"hdnc@hmail"));
		originalMap.put("Canada", new Student(6,"Adam",477,"tehd@tmail"));
		originalMap.put("France", new Student(7,"Saba",577,"tehd@tmail"));
		
		Main m1=new Main();
		
		Map<String,Student> x=m1.sortMapUsingStudentName(originalMap);
		System.out.println(x);
		
		System.out.println("-------------------------------------------");
		
		originalMap.entrySet().forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
	}
	
}
