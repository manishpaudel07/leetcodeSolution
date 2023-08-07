package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

//import com.sun.javafx.collections.MappingChange.Map;

 // revising Collections.


public class Linkedln {

 boolean returnDuplicates (int nums[])
 
 {
	 Set<Integer> set=new HashSet<>();
	 
	 for (int i=0;i<nums.length;i++)
	 {
		 if(!set.add(nums[i]))
		
			 {
			 return true;
			 }
	 }
	 
    return false;	 
 }
	

	public static void main(String[] args) {
		
		
		 HashSet<ArrayList> set = new HashSet<>();
		  
	        // create ArrayList list1
	        ArrayList<Integer> list1 = new ArrayList<>();
	  
	        // create ArrayList list2
	        ArrayList<Integer> list2 = new ArrayList<>();
	  
	        // Add elements using add method
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);
	        list2.add(1);
	        list2.add(2);
	        list2.add(3);
	        
	        set.add(list1);
	        set.add(list2);
	  
	        // print the set size to understand the
	        // internal storage of ArrayList in Set
	        System.out.println(set.size());
	        System.out.println(set);
	        
	        
	System.out.println("------------------------------------------------");        
		Linkedln linkedln=new Linkedln();
		Set<Integer > set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		
		System.out.println("Set1"+set1);
		
		Set<Integer > set2=new HashSet<>();
		set2.add(3);
		set1.retainAll(set2);
		System.out.println("After retaining all set2"+set1);
		
		int nums[]= {1,2,3};
		
		System.out.println(linkedln.returnDuplicates(nums));
				
List<String> list=new Stack<>();
Stack<Integer> stack=new Stack<>();
stack.push(1);

stack.search(1);
System.out.println(stack);

Set<Integer> set11=new HashSet<>();
set11.add(1);
set11.add(2);
set11.add(2);

System.out.println("the set elements:"+set11);




list.add("Hari");
list.add("shyam");

System.out.println("adding new list element");
list.add("rahul");

list.remove("Hari");
list.add("");
list.add("");
list.size();
System.out.println(list.get(0));

System.out.println(list);

for (String str:list)
{
	System.out.println(str);
}


  /*  int []  arr= new int[4];
		try {
			  
			int i=arr[4];
			
			System.out.println("Hello Let me get out");
			
		}
		catch(Exception e)
		{
			System.out.println("There might be an exception");
      System.out.println(e);			
		}
//	
		
	}*/
	}
	
}
