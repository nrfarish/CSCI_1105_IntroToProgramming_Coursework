/*
 * Nic Farish
 * 2/25/20
 * Program that outputs a number that is the number
 * of digits of the second integer
 */

import java.util.Scanner;

public class formatPrint {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		System.out.print("Enter the width of the number: ");
		int width = input.nextInt();
		
		System.out.println(format(num, width));
	}
	
	public static String format(int n, int w) {
		
		String myString = "";
		String nString = Integer.toString(n);
		int newW = w - nString.length();
		for (int i = 0; i < newW; i++) {
			myString = myString + "0";
		}
		myString = myString + n;
		return myString;
	}

}
