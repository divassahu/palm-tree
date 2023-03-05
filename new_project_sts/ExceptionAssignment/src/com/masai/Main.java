package com.masai;

public class Main {
	
	public static void main(String[] args) {
		Student s=new Student();
		
		Student s1=new Student();
		
		System.out.println(s.equals(s1));
		System.out.println(s1.hashCode());
		
	}

}
