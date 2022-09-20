package problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Student> st=new ArrayList<>();
		st.add(new Student(2,"n1",546));
		st.add(new Student(7,"n2",647));
		st.add(new Student(45,"n3",647));
		st.add(new Student(63,"n4",648));
		st.add(new Student(43,"n5",944));
		st.add(new Student(65,"n7",863));
		st.add(new Student(65,"n7",863));
		
		Stream<Student> ss= st.stream();
		Stream<Student> ss2=ss.filter(s->s.getMarks()>600);
		Set<Student> filteredList=ss2.collect(Collectors.toSet());
		
		filteredList.forEach(System.out::println);
		System.out.println("**************************");
		
		st.forEach(System.out::println);
	}
	
}
