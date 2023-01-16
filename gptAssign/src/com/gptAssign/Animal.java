package com.gptAssign;

/*
 Assignment:

Create a class called "Animal" that has the following properties:

name (a string)

weight (a double)

age (an int)

sound (a string)

Create a constructor for the class that initializes the properties with the values passed in as arguments.

Create a method called "speak()" that prints the animal's sound to the console.

Create another class called "Dog" that inherits from the Animals class.

Add a new property to the Dog class called "breed" (a string).

Create a constructor for the Dog class that calls the constructor of the Animals class and also initializes the breed property.

Override the speak() method in the Dog class so that it prints "Woof woof" to the console.

Create an instance of the Dog class and call the speak() method on it to see the output.

 */

public class Animal {
	
	private String name;
	
	private Integer age;
	
	private double weight;
	
	private String sound;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, Integer age, double weight, String sound) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.sound = sound;
	}

	public void speak() {
		
		System.out.println("Sound of animal is :"+this.sound);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	
	
}
