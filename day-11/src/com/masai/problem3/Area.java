package com.masai.problem3;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		int rectArea=length*breadth;
		return rectArea;
	}

	@Override
	public int squareArea(int side) {
		int sqArea=side*side;
		return sqArea;
	}

	@Override
	public double circleArea(int radius) {
		double cirArea=3.14159*radius*radius;
		return cirArea;
	}

}
