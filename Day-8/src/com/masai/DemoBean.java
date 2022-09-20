package com.masai;

import java.util.Scanner;

public class DemoBean {
	private int roll;
	private String name;
	private String address;
	private int marks;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter no of student : ");
		Scanner sc= new Scanner(System.in);
		
		int nOfSt= sc.nextInt();
		
		for(int i=0; i<nOfSt; i++) {
			
		}
	}
}
