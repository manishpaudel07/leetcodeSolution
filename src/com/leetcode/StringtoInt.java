package com.leetcode;

import java.util.Scanner;

public class StringtoInt {

	public static int myAtoi(String s)
	{	//Incomplete
		int num;
		s=s.trim();
		if (s.length()==0)
			return 0;
		num = Integer.parseInt(s);

		return num;
	}
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
	
		int result=myAtoi(s);
		System.out.println(result);
		
	}

}
