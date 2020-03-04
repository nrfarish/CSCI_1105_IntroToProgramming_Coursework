import java.util.Scanner;

/**
 * This program is used to eliminate duplicate numbers from and input array
 * 
 * @author Nic Farish
 * 03/03/20
 */
public class eliminateDuplicates {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] myList = new int[10];
		String myString = "";
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
		}
		
		for (int e: eliminateDuplicate(myList)) {
			myString = myString + e + " ";
		}
		
		System.out.println("The number of distinct numbers is " +
		eliminateDuplicate(myList).length);
		
		System.out.print("Array without duplicates: " + myString);
		

	}

	public static int[] eliminateDuplicate(int[] list) {
		int count = 0;
		boolean flag = false;
		int[] newList = new int[10];

		for (int j = 0; j < list.length; j++) {

			for (int i = 0; i < newList.length; i++) {
				if (list[j] == newList[i] ) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				newList[count] = list[j];
				count ++;
			}
			else
				flag = false;

		}
		
		int[] finalList = new int [count];
		for (int i = 0; i < count; i++) {
			finalList[i] = newList[i];
		}
		
		return finalList;
	}

}
