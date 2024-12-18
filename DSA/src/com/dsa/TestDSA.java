package com.dsa;

public class TestDSA {

	
	  public static  int[] twoSum(int[] nums, int target) {
		  
		 
		  for(int i=0; i<nums.length;i++) {
	 
			   
			  for(int j=i+1; j<nums.length;j++) {
				  
				  
				  if(nums[j]==target-nums[i]) {
					  
				
					return new int[] {i,j};  
					  
				  }
				  }} return null;
	  }
	
	
	
	public static void main(String[] args) {
		
		int targets=9;
		int [] arr=new int[4];
		
		arr[0]=1;
		arr[1]=4;
		arr[2]=3;
		arr[3]=5;
		
	int[] res=twoSum(arr,targets);
	
	for(int i: res) {
		System.out.println(i);
	}
	
	

	}

}
