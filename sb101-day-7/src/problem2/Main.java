package problem2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> st=new ArrayList<>();
		
		st.add(new Student(10,"vikas",390));
		st.add(new Student(12,"vishal",670));
		st.add(new Student(14,"vivek",790));
		st.add(new Student(3,"vibhav",990));
		st.add(new Student(19,"vibhor",690));
		st.add(new Student(13,"vaghmare",330));
		
		Comparator<Student> comp=Comparator.comparing(Student::getMarks);
		Student topper=st.stream().max(comp).get();
		
		System.out.println(topper+" congratulations got the highest marks");
	}
}
