package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	 public static List<List<Integer>> threeSum(int[] nums) 
	 {
		List<List<Integer>> lists= new ArrayList<>();
		Arrays.sort(nums);
		
		  for (int i = 0; i + 2 < nums.length; i++) {
		        if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
		            continue;
		        }
		  }
		 int j; int k;
			
		return lists;
		
	 }
	public static void main(String[] args) 
	{
		int []nums= {-1,0,1,2,-1,-4};
		System.out.println(threeSum( nums)); 	
	}

}
