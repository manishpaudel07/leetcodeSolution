package com.leetcode;

public class NoDuplicatesArray {
	  public static int removeDuplicates(int[] nums) {
		  //
		  int noDuplicates = 1;
		  
	        for(int i = 1; i < nums.length; i++){
	        		//comparing num[1] to nums[0]
	        	if(nums[i] != nums[noDuplicates-1]){
	               // if num[1] != num[0]
	        		//nums[1]=num[0]; then noDuplicates increases
	        		
	        		nums[noDuplicates++] = nums[i];
	            }
	        }
	    return noDuplicates;
	    }

	public static void main(String[] args) {

		int []nums =  {0,0,1,1,1,2,2,3,3,4};
		int result=removeDuplicates(nums);
		System.out.println(result);
	}

}


/*Set <Integer> abc = new HashSet <Integer>();
for (Integer t:array){  
    abc.add(t); 
}*/