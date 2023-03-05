package com.masai;

import java.util.Objects;

public class Student {
	
	private int roll;

	private String name;

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

	@Override
	public int hashCode() {
		return Objects.hash(name, roll);
	}

	@Override
	public boolean equals(Object o) {
		if(this==o)
			return true;
		
		if(o==null)
			return false;
		
		if(this.getClass()!=o.getClass())
			return false;
		
		Student other=(Student) o;
		return Objects.equals(name, other.name)  && roll==other.roll;
	}
	
	

}
