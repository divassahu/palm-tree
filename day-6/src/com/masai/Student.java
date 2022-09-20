package com.masai;

public class Student {
	
	private int roll;
	private String name; 
	private int age;
	private int marks;
	
	Student(){
		
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>=0 && marks<=500)
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18 && age<=60)
		this.age = age;
	}
	
	Student(String name, int age, int roll, int marks){
		this.name=name;
		this.age=age;
		this.roll=roll;
		this.marks=marks;
	}
	public void showDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+age);
		System.out.println("Marks is :"+marks);
	}
}
