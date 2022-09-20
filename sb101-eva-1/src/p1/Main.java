package p1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<Employee,String> tm=new TreeMap<>(new Democomp());
		tm.put(new Employee(1,"n1",1000), "hr");
		tm.put(new Employee(2,"n2",6000), "operation");
		tm.put(new Employee(3,"n3",3000), "prod");
		tm.put(new Employee(4,"n4",5000), "sales");
		tm.put(new Employee(5,"n5",500), "hr");
		
		Set<Map.Entry<Employee,String>> set=tm.entrySet();
		
		for(Map.Entry<Employee, String> me:set) {
			System.out.println("employee department is : "+me.getValue());
			
			Employee emp=me.getKey();
			
			System.out.println("employee id is : "+emp.getEmpId());
			System.out.println("employee name is : "+emp.getEmpName());
			System.out.println("employee  Salary is : "+emp.getSalary());
			
		}
	}
}
