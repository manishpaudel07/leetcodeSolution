package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the
 length of both strings s and p will not be larger than 20,100.

The order of output does not matter.*/
public class Anagrams {

	 public static List<Integer>  findAnagrams(String s, String p)
	 {
		
		 List<Integer> lists= new ArrayList<Integer>();
		 		char[] charS= s.toCharArray();
		 		char[] charP=p.toCharArray();
		 	
		 		
		 	if (s.contains(p))
		 	{
		 		lists.add(s.indexOf(p));
		 	}
		 	
		 return lists;
		 
	 }
	public static void main(String[] args) 
	{
	
		String s= "cbaebabacd" ,
				p= "abc";
		List<Integer> lists= findAnagrams( s,  p);
		System.out.println(lists);
	}
}
