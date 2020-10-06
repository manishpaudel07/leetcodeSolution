package com.leetcode;

import java.util.Scanner;

public class StringtoInt {

	public static int myAtoi(String s)
	{
		int num=0;
		try {
			num=Integer.parseInt(s);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
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
