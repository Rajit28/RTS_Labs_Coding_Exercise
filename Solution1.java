package Rtlslabs;

import java.util.Scanner; 

public class Solution1 {
	
	public static int[] Check(int[] digits,int target) {
		
		// Created an int array of size 3 to store 
		// the number of integers 'above' , 'below' and 'exact value'
		int[] result = new int[3];
		
		// Int variables to keep the count 
		int more= 0;
		int less = 0;
		int same = 0;
		
		// For loop to check all the integers in the array 
		for(int i = 0 ; i < digits.length; i ++) {
			
			// Increment the count of the variable 'same' if is found 
			if(target == digits[i]) {
				same++;
			}
			// Increment the count of the variable 'more' if 
			// a value greater than target is found
			if(digits[i] > target) {
				more++;
			}
			// Increment the count of the variable 'less' if 
			// a value is lesser than the target
			if(digits[i] < target) {
				less++;
			}
		}
		
		// Store the value of variables at specific index's of the result array
		result[0] = more;
		result[1] = less;
		result[2] = same;
		
		// Return an int array
		return result;
		
		
	}
	
	public static void main(String [] agrs) {
		
		// Created a scanner object to get input from user
		Scanner myObj = new Scanner(System.in);
		
		// Created an integer array 
		int[] digits = new int[] {4,6,8,9,3};
		
		try {
		// Taking integer input from the user against which the other numbers in the array would be checked	
		System.out.println("The array of integers is [4,6,8,9,3]");
		System.out.println("Please enter the number to get a  count of numbers above and below it");
		int target = myObj.nextInt();
		
		// Storing the int array returned by the 'Check' function 
		int[] res = Check(digits, target);
		
		// Displaying the result from extracting values from the 'res' int array
		System.out.println("Number of digits greater than target" +" : "+ res[0]);
		System.out.println("Number of digits smaller than target" +" : "+ res[1]);
		System.out.println("Number of times the exact number was found" +" : "+ res[2]);
		
		} catch (Exception e) {
			// Printing the exception caught
			System.out.println(e);
			System.out.println("Please enter a integer value!");
		}
		
		
	}

}
