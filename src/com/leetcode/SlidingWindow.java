package com.leetcode;

public class SlidingWindow {

	public static int maxSumWindowK(int arr[], int k) {
		int sum = 0;

		int i = 0;
		int j = 0;
		int max = 0;
		while (j < arr.length) {

			sum = sum + arr[j];
			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
				max = Math.max(max, sum);
				sum = sum - arr[i];
				j++;
				i++;

			}
		}

		return max;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int k = 3;
		int max = maxSumWindowK(arr, k);
		System.out.println(max);

	}

}
