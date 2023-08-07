package com.leetcode;

import java.util.Scanner;

public class MainArea {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		double length;
		double width;
		double side;
		double radius;
		System.out.println("Enter the length of the rectangle");
		length=scanner.nextDouble();
		System.out.println("Enter the width of the rectangle");
		width=scanner.nextDouble();
		System.out.println("Enter the side of the square");
		side= scanner.nextDouble();
		System.out.println("Enter the radius of the circle");
		radius=scanner.nextDouble();
		
		
		Shape shape=new Area();
		shape.rectangleArea(length, width);
		shape.circleArea(radius);
		shape.squareArea(side);
		scanner.close();

	}

}
