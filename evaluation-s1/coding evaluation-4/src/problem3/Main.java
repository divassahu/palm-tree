package problem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Student> students=new ArrayList<Student>();
		SortMarks sortM=new SortMarks();
		
		students.add(new Student(54,"abc",670));
		students.add(new Student(55,"abcd",650));
		students.add(new Student(35,"dabc",570));
		students.add(new Student(4,"adbc",70));
		
		Collection.sort(students,sortM);
		
		for(Student st: students) {
			System.out.println(st);
		}
		
	}
}
