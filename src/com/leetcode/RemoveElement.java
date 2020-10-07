package com.leetcode;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {

		   int noValElem = 0;    
		   for(int i = 0; i < nums.length; i++){
		       
			   if (nums[i]!=val)
			   {
				   nums[noValElem]=nums[i];
				   noValElem++;
			   }
		       
		   }
		   
		   return noValElem;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int result = removeElement(nums, val);
		System.out.println(result);
	}

}
/*Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.*/