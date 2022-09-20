package com.masai.problem3;

public class Main {
	public static void main(String[] args) {
		Shape s1=new Area();
		int rec = s1.rectangleArea(60, 20);
		int sq =s1.squareArea(20);
		double cir=s1.circleArea(100);
		
		System.out.println("the area of rectange is "+rec);
		System.out.println("the area of rectange is "+sq);
		System.out.println("the area of rectange is "+cir);
	}
}
