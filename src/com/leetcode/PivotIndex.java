package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class PivotIndex {
//{1,7,3,6,5,6};
public static boolean pivootIndex(int[] nums) {
	Set<Integer> set=new HashSet();
    
    for (int i=0;i<nums.length;i++)
    {
        if (!set.add(nums[i]))
        {
            return true;
        }            
    }
    
    return false;
	   
}        
    
	public static void main(String[] args) {
	
			
		int []nums = {1,2,3,1};
		boolean ree;
		boolean mid= pivootIndex( nums);
		System.out.println(mid);
	}

}
