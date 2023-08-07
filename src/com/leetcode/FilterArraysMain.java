package com.leetcode;

import java.util.Scanner;

public class FilterArraysMain {
	

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("The length of the array:");
			int length=scanner.nextInt();
			int array[] = new int[length];
		
			 for (int i=0;i<length;i++)
			 {
				  array[i]=scanner.nextInt();
			 }
			 
			 FilterArray array2= new FilterArray();
			 
			 int filteredArray=array2.isFilter(array);
			
			 if (filteredArray==0)
			 {
				 System.out.println("The given array is not a filter array");
			 }
			 else
			 {
				 System.out.println(" the given array is a filter array");
			 }
			
	
	}



}
