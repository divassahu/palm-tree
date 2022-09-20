package com.masai.s2d1_p1;

public class Students {
	int roll;
	int marks;
	String name;
	
	void displayStudentsDetails() {
		
		System.out.println("Name is : "+name);
		
		System.out.println("Roll Number is : "+roll);
		
		System.out.println("Marks is : "+marks);
	}
	public static void main(String []args) {
		Students s1=new Students();
		s1.name= "Rahul";
		s1.roll= 56;
		s1.marks= 76;
		
		s1.displayStudentsDetails();
		
		Students s2=new Students();
		s2.name= "Mehul";
		s2.roll= 76;
		s2.marks= 56;
		
		s2.displayStudentsDetails();
		
		//how to make s1 and s2 eligible for garbage collector;
	}
}
