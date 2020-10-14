package com.leetcode;



public class MainParking {

	public static void main(String[] args) {
		
		ParkingSystem parkingSystem= new ParkingSystem(1, 1, 0);
		Boolean resuBoolean=parkingSystem.addCar(1);
		Boolean resuBoolean1=parkingSystem.addCar(2);
		Boolean resuBoolean11=parkingSystem.addCar(3);
		Boolean resuBoolean111=parkingSystem.addCar(1);
	
	System.out.println(resuBoolean);
	System.out.println(resuBoolean1);
	System.out.println(resuBoolean11);
	System.out.println(resuBoolean111);
	
	
	}

}
