package assign.problem3;

import java.util.Stack;

public abstract class PermanentEmployee extends Employee {
	
	public PermanentEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		
	}

	private double basicPay;

	@Override
	void calculateSalary() {
		
		double salary = basicPay-(basicPay*.12);
	}

	public double getBasicPay() {
		return basicPay;
	}

	public double setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	Employee(int employeeId, String employeeName, double employeeSalary){
		
	}
	Stack<Integer> st=new Stack<>();
}
