package com.gptAssign;

public class Dog extends Animal{
	
	public String breed;


	public Dog(String name, Integer age, double weight, String sound,String breed) {
		super(name, age, weight, sound);
		this.breed=breed;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Dog d=new Dog("Oscar", 5, 8.7, "bhoun bhaun", "labrador");
		
		d.speak();
	}
	

}
