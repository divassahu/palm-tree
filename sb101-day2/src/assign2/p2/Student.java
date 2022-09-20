package assign2.p2;

public class Student {
	private int roll;
	private String Name;
	private int marks;
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		Name = name;
		this.marks = marks;
	}
	
	public Student() {
		super();
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", Name=" + Name + ", marks=" + marks + "]";
	}
	
}
