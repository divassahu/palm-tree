package problem2;

import java.util.Objects;

public class Student {
	private int rollNumber;
	private String Name;
	private int marks;
	
	
	public Student(int rollNumber, String name, int marks) {
		super();
		this.rollNumber = rollNumber;
		Name = name;
		this.marks = marks;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Name, marks, rollNumber);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Name, other.Name) && marks == other.marks && rollNumber == other.rollNumber;
	}



	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", Name=" + Name + ", marks=" + marks + "]";
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
