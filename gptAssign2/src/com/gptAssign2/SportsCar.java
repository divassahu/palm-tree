package com.gptAssign2;


/*
 * Assignment:

Create a class called "Car" that has the following properties:
make (a string)
model (a string)
year (an int)
color (a string)
Create a constructor for the class that initializes the properties with the values passed in as arguments.
Create a method called "startEngine()" that prints "Engine started" to the console.
Create another class called "SportsCar" that inherits from the Car class.
Add a new property to the SportsCar class called "maxSpeed" (an int).
Create a constructor for the SportsCar class that calls the constructor of the Car class and also initializes the maxSpeed property.
Override the startEngine() method in the SportsCar class so that it prints "Vroom vroom" to the console.
Create an interface called "Drivable" that has one method called "drive()" that takes no arguments and returns void.
Have the SportsCar class implement the Drivable interface and provide an implementation for the drive() method that prints "Driving at 100 mph" to the console.
Create an instance of the SportsCar class, call the startEngine() method, and then call the drive() method to see the output.
 */

public class SportsCar extends Car implements Drivable{
	public int maxSpeed;

	public SportsCar(String make, String model, int year, String color, int maxSpeed) {
		super(make, model, year, color);
		this.maxSpeed=maxSpeed;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Vroom Vroom");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving at @100.9mph");
		
	}
	
	public static void main(String[] args) {
		SportsCar sp=new SportsCar("ferrari", "xtreem800", 2020, "red", 300);
		sp.startEngine();
		sp.drive();
		
		
	}
	

}
