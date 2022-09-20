package com.Shapes;

public class Main {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.radius=10;
		
		Rectangle r1=new Rectangle();
		r1.length=6;
		r1.breadth=9;
		
		Square sq=new Square();
		sq.side=11;
		
		Shapes s1 = new Shapes();
		
		s1.area(c1);
		s1.area(r1);
		s1.area(sq);
		
	}

}
