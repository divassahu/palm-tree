package com.Shapes;

public class Shapes {
	
	 public void area(Circle circle) {
		System.out.println("Area of cicle is: "+circle.radius*circle.radius*3.14);
	 }
     public void area(Rectangle rectangle) {
	  System.out.println("Area of rectangle: "+rectangle.length*rectangle.breadth);
     }
     public void area(Square square) {
	  System.out.println("Area of Square: "+square.side*square.side);
     }
  
}
