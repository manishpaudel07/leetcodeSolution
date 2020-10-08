package com.leetcode;

public class SearchInRotatedArray {
	 public static boolean search(int[] nums, int target) {
		 int i=0;
		 for (i=0;i<nums.length;i++)
		 {
			 if (nums[i]==target)
			 {
				 return true;
			 }
		 }
	        return false;
	       
	    }

	public static void main(String[] args) {
		
		int [] nums= {2,5,6,0,0,1,2};
		int target=0;
		boolean result=search(nums, target);
		System.out.println(result);
	}

}
