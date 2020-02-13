/*
Nic Farish
2/12/20
Program to calculate the total value of a 
savings account given any number of months.
*/

import java.util.Scanner;

class AccountValue {
	public static void main(String[] args){
		 //create scanner to input savings amount
		Scanner input = new Scanner(System.in);
		System.out.println("Enter monthly saving ammount: $");
		double deposit = input.nextDouble();
		 //declare a variable of the value of the account
		 //calculate the value of the account after six months
		double value = 0;
		value = deposit * (1 + 0.00417);
		value = (value + deposit) * (1 + 0.00417);
		value = (value + deposit) * (1 + 0.00417);
		value = (value + deposit) * (1 + 0.00417);
		value = (value + deposit) * (1 + 0.00417);
		value = (value + deposit) * (1 + 0.00417);
		
		 //display the total value
		System.out.println("After the sixth month, the account value is "
		 + value + ".");
	}
}