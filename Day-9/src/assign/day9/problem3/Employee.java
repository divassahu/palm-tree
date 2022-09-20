package assign.day9.problem3;

public class Employee extends Member {
	String specialisation;
	String department;
	
	public void printDetails() {
		System.out.println("Name of employee is : "+name);
		System.out.println("Age of employee is : "+age);
		System.out.println("Contact number of employee is : "+phoneNumber);
		System.out.println("Address of employee is : "+address);
		System.out.println("Salary of employee is : "+salary);
	}
	
	
}
