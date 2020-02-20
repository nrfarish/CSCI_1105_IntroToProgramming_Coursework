/*
 * Nic Farish
 * 2/19/20
 * Program to count the number of vowels and consonants in an input string
 */

import java.util.Scanner;

public class VowelCounts {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char myChar;
		int vowel = 0;
		int consonant = 0;
		String myString;
		System.out.println("Enter a string: ");
		myString = input.nextLine();

		myString = myString.toUpperCase();
		
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'A' ^ myString.charAt(i) == 'E' ^
			myString.charAt(i) == 'I' ^ myString.charAt(i) == 'O' ^
			myString.charAt(i) == 'U') {
				vowel++;
			}
			else
				consonant++;
		}
		System.out.print("The number of vowels is: " + vowel + "\n");
		System.out.print("The number of consonants is:" + consonant);
	}

}
