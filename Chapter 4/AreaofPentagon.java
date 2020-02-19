/*
 * Nic Farish
 * 2/18/20
 * Program to find the area of a pentagon
 */

import java.util.Scanner;

public class AreaofPentagon {

	public static void main(String[] args) {
		  //create scanner object prompt user for input
		  //declare all variables
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ength from the" + 
		"center of a pentagon to a vertex : ");
		double r = input.nextDouble();
		double s = 0.0;
		double area = 0.0;
		  //calculate length of a side
		s = (2 * r) * Math.sin(Math.PI / 5);
		  //calculate area of the pentagon and print it
		area = (5 * (s * s)) / (4 * Math.tan(Math.PI / 5));
		System.out.printf("The area of the pentagon is %5.2f.", area);

	}
}
