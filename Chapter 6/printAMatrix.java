/*
 * Nic Farish
 * 2/25/20
 * Program to to prompt users for n and print an n by n
 * matrix of randomly generated 1’s and 0’s.
 */

import java.util.Scanner;

public class printAMatrix {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		matrix(n);
		
	}
		
	public static void matrix(int num) {
	
		int digitsPerLine = num;
		int totalDigits = num * num;
				
		for (int i = 1; i < totalDigits + 1; i++) {
			if (i % digitsPerLine == 0)
				System.out.println((int)(Math.random() * 2));
			else
				System.out.print((int)(Math.random() * 2) + " ");
		}

	}

}
