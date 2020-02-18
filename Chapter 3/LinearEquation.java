/*
Nic Farish
2/18/20
Pseudocode program to solve linear equation
*/

import java.util.Scanner;

public class LinearEquation {
  public static void main(String[] args) { 
      //create scanner and declare variables for x and y
    Scanner input = new Scanner(System.in);
    double x = 0.0;
    double y = 0.0;
    
      //prompt user and declare variables for a, b, c, d, e, and f
    System.out.println("Enter a: ");
    double a = input.nextDouble();
    System.out.println("Enter b: ");
    double b = input.nextDouble();
    System.out.println("Enter c: ");
    double c = input.nextDouble();
    System.out.println("Enter d: ");
    double d = input.nextDouble();
    System.out.println("Enter e: ");
    double e = input.nextDouble();
    System.out.println("Enter f: ");
    double f = input.nextDouble();
    
      //set a selective statement to rule out the ability to divide by 0
    if (a * d - b * c != 0) {
    	x = (e * d - b * f) / (a * d - b * c);
    	y = (a * f - e * c) / (a * d - b * c);
    	System.out.println("x = " + x);
    	System.out.println("y = " + y);
    }
    else {
    	System.out.println("Cannot divide by zero");
    }
  }
}
