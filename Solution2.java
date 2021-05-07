package Rtlslabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 

public class Solution2 {
	
	public static String Sol(String qstr, int user_input) {
		
		// If the length of the input is "0" return a invalid input message
		if(qstr.length() == 0 ) {
			return "Invalid Input";
		}
		
		// If the length of the string is same as the number entered by user, return the same string.
		if(qstr.length() == user_input) {
			return qstr;
		}
		
		// Create an Arraylist to store the characters from the original String.
		ArrayList<Character> list = new ArrayList<>();
		
		// Create a StringBuilder Object to return a String
		StringBuilder sb = new StringBuilder();
		
		// Add the characters from the String which are 'n' places from the end of the string.
		for(int i = qstr.length()-1; i >= qstr.length() - user_input; i --) {
		
			list.add(qstr.charAt(i));
		}
		
		// Reverse the list to maintain the order of the characters after the rotation.
		Collections.reverse(list);
		
		// Add all the characters of the string to the list
		// which were not affected by the rotation.
		for(int i = 0 ; i <= qstr.length()-user_input-1; i ++) {
			list.add(qstr.charAt(i));
		}
		
		// Add the characters in the list to the stringBuilder 
		for(int i = 0 ; i < list.size(); i ++) {
			sb.append(list.get(i));
		}
		
		// Convert the sb to string before returning.
		return sb.toString();
		
	}
	
	public static void main (String[] args) {
		// Created a scanner object to get input from user
		Scanner myObj = new Scanner(System.in); 
		
		// Take input String from user to Rotate
		System.out.println("Enter the String for rotation");
		String qstr = myObj.nextLine();
		
		// Take input integer from user to Rotate by number of places
		System.out.println("Enter The value of 'n' for rotation");
		int user_input = myObj.nextInt();
		
		// Call function 'Sol' and pass the string which user entered along with the 
		// number of places to be rotated.
		// The returned string in 'result'
		String result = Sol(qstr, user_input);
		
		// Display the final result of the string to the user.
		System.out.println("The result of the string manipulation is" + " : "+ result);
	
	}

}
