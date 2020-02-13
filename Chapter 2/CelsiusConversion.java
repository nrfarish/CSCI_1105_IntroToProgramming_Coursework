/*
Nic Farish
2/12/20
Program to convert Celsius to Fahrenheit readings.
*/

import java.util.Scanner;

class CelsiusConversion {
	public static void main(String[] args) {
		 //create scanner object
		Scanner input = new Scanner(System.in);
		 //promt for Celsius imput
		System.out.print("Enter degrees Celsius: ");
		double degrees = input.nextDouble();
		 //compute fahrenheit conversion
		double fahrenheit = (9.0 / 5) * degrees + 32;
		 //print output of the conversion in fahrenheit
		System.out.println(degrees + " Celsius is " + fahrenheit + " Fahrenheit.");
	}
}