/*
 * Nic Farish
 * 2/18/20
 * Program to find the perimeter of a triangle.
 */

import java.util.Scanner;

public class TrianglePerimeter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Triangle side a: ");
		double a = input.nextDouble();
		System.out.println("Triangle side b: ");
		double b = input.nextDouble();
		System.out.println("Triangle side c: ");
		double c = input.nextDouble();
		double perimeter = 0.0;

		if (a + b > c && a + c > b && b + c > a) {
			perimeter = a + b + c;
			System.out.println("The perimeter of the triangle is " +
			perimeter + ".");
		}
		else
			System.out.println("The input is invalid.");
	}

}
