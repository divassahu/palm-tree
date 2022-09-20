package problem3;

public class Student {
	private int rollNumber;
	private String name;
	private int mathsMarks;
	private int scienceMarks;
	private int engMarks;
	
	int totalMarks() {
		int MarksSum=0;
		MarksSum=mathsMarks+scienceMarks+engMarks;
		return MarksSum;
	}
	
	Student(int rollNumber, String name, int MarksSum){
		this.rollNumber=rollNumber;
		this.name=name;
		this.totalMarks();
		
	}
	
	Student(){
		
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public int getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	
}
