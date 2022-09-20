package com.masai.problem2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee obj=new Employee();
		
		System.out.println("enter no of employees");
		int num=sc.nextInt();
		if(num>=2) {
			int[] age=new int[num];
			System.out.println("enter the details of ["+num+"] employees");
			for(int i=0;i<num;i++) {
				int ageEmp=sc .nextInt();
				age[i]=ageEmp;
			}
			System.out.println("the average age of employees is "+obj.calculateAge(age));
		}
		else {
			System.out.println("Please enter a valid employee count");
		}
	}
}
