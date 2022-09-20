package problem2;

import java.util.Objects;

public class Employee {
	private int empId;
	private String Name;
	private long Salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String name, long salary) {
		super();
		this.empId = empId;
		Name = name;
		Salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name, Salary, empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Name, other.Name) && Salary == other.Salary && empId == other.empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
	
}
