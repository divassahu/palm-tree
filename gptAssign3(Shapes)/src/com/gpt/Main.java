package com.gpt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] shape=new Shape[2];
		
		shape[0]=new Circle("golu", "red", 5);
		
		shape[1]=new Rectangle("chaturbhuj", "blue", 8, 12);
		
		for(Shape x: shape) {
			System.out.println("Name of shape is "+ x.name + " with color " + x.color + " having area " + x.calculateArea());
		}
		
		
		

	}

}
