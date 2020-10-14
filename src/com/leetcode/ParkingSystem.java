package com.leetcode;

public class ParkingSystem {

	int []parkings;
	public ParkingSystem(int big, int medium, int small) {
      parkings=new int[] {0,big,medium,small}; // 0,1,2,3
      					//  1	 1	    0
    }


	public boolean addCar(int carType) 
    {
    return this.parkings[carType]-->0; //1
    }
}
