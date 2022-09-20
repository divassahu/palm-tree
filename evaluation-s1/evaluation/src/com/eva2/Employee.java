package com.eva2;

import java.util.Scanner;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	double netSalary;
	
	public void calculateNetSalary(int pfPercentage) {
		netSalary= salary-((pfPercentage*salary)/100);
		
		System.out.println("net salary is : "+netSalary);
	}
}

class Main{
	
	public static Employee getEmployeeDetails() {
		Employee e1= new Employee();
		
		return e1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of employee");
		
		int noOfEmployee = sc.nextInt();
		
		System.out.println("\n");
		
		for(int i=0;i<noOfEmployee;i++) {
			
			System.out.println("enter employee id");
			
			int employeeId = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("enter employee name");
			
			String employeeName= sc.nextLine();
			
			System.out.println("enter employee salary");
			
			int employeeSalary= sc.nextInt();
			
			System.out.println("employee Details : "+ Main.getEmployeeDetails());
			
			System.out.println("employee id is : "+ employeeId);
			
			System.out.println("Student Name is : "+ employeeName);
			
			System.out.println("Student marks is : "+ employeeSalary);
		}
	}
}
