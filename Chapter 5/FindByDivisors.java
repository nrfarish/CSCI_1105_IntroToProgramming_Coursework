/*
 * Nic Farish
 * 2/19/20
 * Program to find number between 100 and 200 that are
 * divisible by 5 or 6 but not boths
 */

public class FindByDivisors {

	public static void main(String[] args) {
		
		final int NUMBER_PER_LINE = 10;
		int count = 1;
		int number;
		
		System.out.println("Counting from 100 - 200");
		System.out.println("Divisible by 5 or 6, but not 5 and 6");
		System.out.println("-------------------------------------");
		
		for (number = 100; number <= 200; number++) {
			if (number % 5 == 0 ^ number % 6 == 0) {				
				if (count % NUMBER_PER_LINE == 0) {
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
				count++;
			}
		}
		
	}

}
