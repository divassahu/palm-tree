package assign2.p2;

import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		TreeMap<Student,String> tm=new TreeMap<>(new StudentMarksComp());
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of entries");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			
			System.out.println("enter student Name "+(i+1));
			String stName=sc.next();
			
			System.out.println("enter student roll "+(i+1));
			int stRoll=sc.nextInt();
			
			System.out.println("enter student marks "+(i+1));
			int stMarks=sc.nextInt();
			
			System.out.println("enter state name");
			String st=sc.next();
			
			tm.put(new Student(stRoll,stName,stMarks), st);
		}
		
		Set<Map.Entry<Student,String>> set= tm.entrySet();
		
		for(Map.Entry<Student, String> me: set) {
			System.out.println("Student belongs to : "+me.getValue());
			Student st=me.getKey();
			System.out.println("Student roll number is : "+st.getRoll());
			
			System.out.println("Student Name is : "+st.getName());
			
			System.out.println("Student Marks is : "+st.getMarks());
			System.out.println("==========================");
			
		}
	}
}
