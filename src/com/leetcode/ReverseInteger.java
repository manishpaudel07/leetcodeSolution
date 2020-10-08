package com.leetcode;

public class ReverseInteger {
public static int reverse(int x) {

		int reversedInteger = 0;
		int result = 0;
		int prev = 0;
		int max = (int) Math.pow(2, 31) - 1;
		int min = (int) Math.pow(-2, 31);

		if (min < x && x < max) {

			while (x != 0) {
				reversedInteger = x % 10;
				result = result * 10 + reversedInteger;
				if ((result - x % 10) / 10 != prev) {
					return 0;
				}
				prev = result;
				x = x / 10;

			}
		}

		return result;
	}

	public static void main(String[] args) {

		int x =-1563847412;
		//-2147483645  -2143847412
	System.out.println(reverse(x));
	 
}
}