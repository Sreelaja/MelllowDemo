package com.mellow.MellowAutomation;

public class TraverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to traverse an array use a 'for' look to iterate from 0 to one less than the length of the array
		//inside the loop, use the loop control variable to access the element at the current index
		
		int[]lottonumber = {12,13,14,15,16};	
		
		for(int i = 0; i<=lottonumber.length-1; i++) {
			
			System.out.println(lottonumber[i]);

		}

	}

}
