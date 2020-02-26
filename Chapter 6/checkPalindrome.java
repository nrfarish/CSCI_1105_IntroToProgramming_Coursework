/*
 * Nic Farish
 * 2/25/20
 * Program to check if and integer is a palindrome
 */

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int num = input.nextInt();

		if (isPalindrome(num) == true)
			System.out.println(num + " is a palindrome.");
		else
			System.out.println(num + " is not a palindrome.");
		
	}
	
	public static boolean isPalindrome(int number) {

		if (number == reverse(number))
			return true;
		else
			return false;
	}
	
	public static int reverse(int number) {
		
		String myString = Integer.toString(number);
		String newString = "";
		for (int i = myString.length() - 1; i >= 0; i-- ) {
			
			char ch = myString.charAt(i);
			newString = newString + ch;
		}
		int newNum = Integer.parseInt(newString);
		return newNum;
	}

}
