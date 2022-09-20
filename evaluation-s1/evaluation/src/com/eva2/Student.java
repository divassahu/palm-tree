package com.eva2;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String studentName;
	int marks;
	
	Student(){
		
	}
	Student(int roll, String name, int mark){
		this.rollNumber=roll;
		this.studentName=name;
		this.marks=mark;
	}
}

class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of students");
		
		int studentNum= sc.nextInt();
		
		System.out.println("\n");
		
		for(int i=0;i<studentNum;i++) {
			
			
			System.out.println("enter roll number");
			
			int rollN = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("enter st name");
			
			String studentName= sc.nextLine();
			
			System.out.println("enter student marks");
			
			int studentMarks= sc.nextInt();
			
			System.out.println("Student Details : "+ i+1);
			
			System.out.println("Student Roll number is : "+rollN);
			
			System.out.println("Student Name is : "+ studentName);
			
			System.out.println("Student marks is : "+ studentMarks);
			
			}
	}
}
