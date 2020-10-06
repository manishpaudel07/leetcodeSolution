package com.leetcode;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int x) {

		int remainder;
		int reversedInteger = 0;
		int num = x;

		if (num < 0)
			return false;
		while (x != 0) {
			remainder = x % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			x = x / 10;

		}
		if (reversedInteger == num)

			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		boolean result = isPalindrome(x);
		System.out.println(result);
	}

}
