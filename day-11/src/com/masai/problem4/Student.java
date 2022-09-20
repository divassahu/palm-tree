package com.masai.problem4;

import java.util.Arrays;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	Student(int roll,String name, int marks){
		this.roll=roll;
		this.marks=marks;
		this.name=name;
	}
	
	public void displayDetails() {
		System.out.println(this.toString());
	}
	
	public void printGrade() {
		
			if(this.marks>=500) {
				this.setGrade('A');
			}
			else if(this.marks>=400 && this.marks<500) {
				this.setGrade('B');
			}
			else if(this.marks<400) {
				this.setGrade('C');
			}
	}
	
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + ", getRoll()="
				+ getRoll() + ", getName()=" + getName() + ", getMarks()=" + getMarks() + ", getGrade()=" + getGrade()
				+ "]";
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}
