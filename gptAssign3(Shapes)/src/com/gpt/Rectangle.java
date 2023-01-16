package com.gpt;

/*

 * Assignment:


Create an abstract class called "Shape" that has the following properties:

name (a string)

color (a string)

Create an abstract method called "calculateArea()" that returns a double and takes no arguments.

Create two classes, "Circle" and "Rectangle", that inherit from the Shape class.

In the Circle class, add a property called "radius" (a double) and initialize it in the constructor. Implement the calculateArea() method to return the area of a circle using the formula pi * radius^2.

In the Rectangle class, add properties called "length" and "width" (both doubles) and initialize them in the constructor. Implement the calculateArea() method to return the area of a rectangle using the formula length * width.

Create an array of Shape objects and add an instance of the Circle and Rectangle classes to it.

Iterate through the array and call the calculateArea() method on each object to see the output.

 */

public class Rectangle extends Shape{
	
	public double length;
	public double width;
	
	

	public Rectangle(String name, String color, double length, double width) {
		super(name, color);
		this.length=length;
		this.width=width;
		
		// TODO Auto-generated constructor stub
	}



	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
