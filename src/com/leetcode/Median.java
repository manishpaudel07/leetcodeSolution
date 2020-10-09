package com.leetcode;

import java.util.Arrays;

public class Median {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] twoArrays;
		int length = nums1.length + nums2.length;
		twoArrays = new int[length];
		int count = 0;
		double median = 0;
		for (int i = 0; i < nums1.length; i++) {
			twoArrays[i] = nums1[i];
			count++;
		}

		for (int i = 0; i < nums2.length; i++) {
			twoArrays[count++] = nums2[i];

		}
		Arrays.sort(twoArrays);
		
			if (length % 2 != 0) {
				median = length / 2;
			median = twoArrays[(int) median];
				return median;
			} else if (length % 2 == 0) {
				int mid = length / 2;
				median = twoArrays[mid] + twoArrays[mid - 1];
				median = median / 2;
				return median;
			}
		
		return 0;
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3};

		double result = findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}

}
