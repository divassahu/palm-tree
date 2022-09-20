package assign10.problem1;

public class Student extends Person {
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
}
