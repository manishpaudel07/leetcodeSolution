package com.leetcode;

import java.util.Scanner;

public class AddStrings {

	 public static String addStrings(String num1, String num2)
	 {
		 
		 int sum=Math.addExact(Integer.parseInt(num1), Integer.parseInt(num2));
		return String.valueOf(sum);
		 //adding strings
	 }
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in );
		
		String num1;
		num1=scanner.next();
		
		String num2;
		num2=scanner.next();
		
		String result=addStrings(num1, num2);
	System.out.println(result);
	}

}
