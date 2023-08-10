package com.leetcode;

import java.util.Scanner;



public class ArrayMultiplication {
	public int[] productExceptSelf(int[] nums) {
		 
	    int n = nums.length;
	    int[] leftProducts = new int[n];
	    int[] rightProducts = new int[n];
	    int[] answer = new int[n];
	    
	    leftProducts[0] = 1;
	    for (int i = 1; i < n; i++) {
	        leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
	    }
	    
	    rightProducts[n - 1] = 1;
	    for (int i = n - 2; i >= 0; i--) {
	        rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
	    }
	    
	    for (int i = 0; i < n; i++) {
	        answer[i] = leftProducts[i] * rightProducts[i];
	        
	    }
	    
	    return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		ArrayMultiplication arrayMultiplication =new  ArrayMultiplication();
		
		
		int []arr=new int [5];
		for (int i=0;i<arr.length;i++ )
			
		{
			arr[i]=scanner.nextInt();
		}
		
		int [] result =arrayMultiplication.productExceptSelf(arr);
		System.out.println("array of multiplication :");
		
        for (int i=0;i<arr.length;i++ )
			
		{
        	System.out.println(result[i]);

		}
		
	}

	}


