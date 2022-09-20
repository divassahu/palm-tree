package com.masai.next;

public class Student {
	private int roll;
	private String name;
	private String add;
	private String collegeName;
	boolean isFromNIT;
	
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
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		if(collegeName.equals("NIT")) {
			this.collegeName = "NIT";
			isFromNIT=true;
		}
		
			
		else
			this.collegeName=collegeName;
	}
	
	public static Student getStudent(boolean isFromNIT) {
		Student s1=new Student();
		if(s1.collegeName.equals("NIT")) {
			isFromNIT=true;
		}
		
	}
}
