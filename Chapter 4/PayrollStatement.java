/*
 * Nic Farish
 * 2/19/20
 * Program to print payroll statement from input information
 */

import java.util.Scanner;

public class PayrollStatement {

	public static void main(String[] args) {
		  //Create scanner object, declare variables
		Scanner input = new Scanner(System.in);
		System.out.println("Enter empoyee's name: ");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked: ");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate: $");
		double payRate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fedTaxRate = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		double grossPay = 0.0;
		double fedTax = 0.0;
		double stateTax = 0.0;
		double deductions = 0.0;
		double netPay = 0.0;
		  //Calculate gross pay
		grossPay = hours * payRate;
		  //Calculate tax whithholdings
		fedTax = fedTaxRate * grossPay;
		stateTax = stateTaxRate * grossPay;
		deductions = fedTax + stateTax;
		  //Calculate net pay
		netPay = grossPay - deductions;
		  //Print payroll statement
		System.out.println("Employee Name: " + name);
		System.out.printf("Hours Worked: %4.1f\n", hours);
		System.out.printf("Pay Rate: $%4.2f\n", payRate);
		System.out.printf("Gross Pay: $%5.2f\n", grossPay);
		System.out.println("Deductions:");
		System.out.printf("\tFederal Withholding (" + fedTaxRate * 100 
			+"%%): $%4.2f\n", fedTax);
		System.out.printf("\tState Withholding (" + stateTaxRate * 100 
			+ "%%): $%4.2f\n", stateTax);
		System.out.printf("\tTotal Deduction: $%4.2f\n", deductions);
		System.out.printf("Net Pay: $%4.2f", netPay);
	}
	
}
