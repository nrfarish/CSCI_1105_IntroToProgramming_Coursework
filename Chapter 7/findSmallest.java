import java.util.Scanner;

/**
 * This is a program to find the smallest element of an array
 * 
 * @author Nic Farish
 *03/03/20
 */
public class findSmallest {

	/**
	 * Main method of the program
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Create scanner
		double[] myList = new double[10]; //Declare myList array with 10 indexes
		System.out.print("Enter 10 numbers separated by a space: "); //Prompt for input
		
		for (int i = 0; i < myList.length; i++) { //Take next ten numbers of input
			myList[i] = input.nextDouble();
		}
		
		System.out.print("The minimum number is: " + min(myList)); //Print the min number from method min

	}
	
	/**
	 * Method to find the smallest number from the input array
	 * 
	 * @param array input array for the method
	 * @return double number representing the smallest number from the
	 * input array.
	 */
	public static double min(double[] array) {
		double minNumber = array[0];
		for (int i = 1; i < array.length; i++) {
			 if (array[i] < minNumber)
				 minNumber = array[i];
		}
		return minNumber;
	}
}
