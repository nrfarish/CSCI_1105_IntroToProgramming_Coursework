/*
 * Nic Farish
 * 2/12/20
 * Program to calculate the cost of driving
 */

import java.util.Scanner;

public class DrivingCalculation {

	public static void main(String[] args) {
		 //create input object
		Scanner input = new Scanner(System.in);	
		 //prompt the user and declare variable for distance
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		 //prompt the user and declare variable for mpg
		System.out.println("Enter miles per gallon: ");
		double milespg = input.nextDouble();
		 //prompt the user and declare variable for ppg
		System.out.println("Enter price per gallon: ");
		double pricepg = input.nextDouble();
		 //calculate price per mile
		double pricepmile = pricepg / milespg;
		 //calculate and display total price
		double costofdriving = pricepmile * distance;
		costofdriving = (int)(costofdriving * 100);
		costofdriving /= 100;
		System.out.println("The cost of driving is $" + costofdriving);
	}

}
