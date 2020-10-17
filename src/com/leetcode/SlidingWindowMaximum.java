package com.leetcode;

import java.util.Arrays;

public class SlidingWindowMaximum {
	public static int[] maxSlidingWindow(int[] nums, int k) {

		int i = 0;
		int j = 0;
		int maximum=nums[i];
		int[] maxNums = new int[nums.length - k + 1];
		if (k == 1) {
			return nums;
		}
		while (j < nums.length) {

			//-7,-8,7,5,7,1,6,0  4
			
			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
			
			
				for (int l=i;l<=j;l++)
				{
					//7,2,4
					maximum=Math.max(maximum, nums[l]);
				}
				maxNums[i] = maximum;
				i++;
				j++;
				maximum=nums[i];
			}

		}
		return maxNums;

	}

	public static void main(String[] args) {
		int[] nums = {9,2};
				
		int k = 2;
		int[] results = maxSlidingWindow(nums, k);
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}

	}

}
