package com.leetcode;

public class Area extends Shape {

	@Override
	void rectangleArea(double length, double width) {
		
		 double areaOfReactangle= length * width;
		 System.out.println("the area of the rectangle is:"+areaOfReactangle);
	}

	@Override
	void circleArea(double radius) {
		double areaOfCircle= 3.14* radius*radius;
		System.out.println("the area of the circle is:"+areaOfCircle);
	}

	@Override
	void squareArea(double side) {
	double areaOfSquare= side*side;
	System.out.println("the area of the square is:"+areaOfSquare);
	}

}
