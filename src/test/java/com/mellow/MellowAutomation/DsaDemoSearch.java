package com.mellow.MellowAutomation;

public class DsaDemoSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {5,7,9,11,13}; // sorted array//populated array
		int target =  11; // this is what I am searching
		
		// search using linear search.
		
		int result = linearsearch(nums, target);
		if (result!=-1) {
			
			System.out.println("The element found at Index: " + result);
		}
		
		else
			System.out.println("Element not found");	

	}

	public static int linearsearch(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<nums.length;i++) {
			
			if(nums[i] == target) {
				return i;
			}
		}
		
		return -1;
		
		
	}

}
