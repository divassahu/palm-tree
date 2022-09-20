package p1;

public class Employee {
	private int EmpId;
	private String empName;
	private int salary;
	
	
	
	public Employee() {
		super();
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int empId, String empName, int salary) {
		super();
		EmpId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
	
}
