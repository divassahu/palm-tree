package com.masai;

public class Main {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setName("Adams");
		s1.setAge(20);
		s1.setMarks(300);
		s1.setRoll(25);
		
		s1.showDetails();
		System.out.println("******************************");
		
		Student s2= new Student("Ponting",35,39,400);
		s2.showDetails();
		
	}
}
