import java.util.Scanner;

/**
 * Program to ask the user for input to guess the capitals of states.
 * 
 * @author student
 *03/11/20
 */
public class guessCapitals {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		String[][] statesCapitals = {
				{"Alabama", "Alaska", "Arizona", "Arkansas", "California",
				"Colorado", "Connecticut", "Delaware", "Florida", "Georgia"
				},
				{"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento",
				"Denver", "Hartford", "Dover", "Tallahasse", "Atlanta"
				}
		};
		
		for (int i = 0; i < statesCapitals[0].length; i++) {
			System.out.print("What is the capital of " + statesCapitals[0][i]
					+ "?");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase(statesCapitals[1][i])) {
				System.out.println("You are correct.");
				count++;
			}
			else
				System.out.println("That answer is incorrect.");
			
		}
		System.out.println("You had " + count + " correct answers.");
	}

}
