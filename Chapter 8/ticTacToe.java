import java.util.Scanner;

/**
 * Program to simulate a tic-tac-toe game via user input
 * 
 * @author student
 *03/11/20
 */
public class ticTacToe {

	public static void main(String[] args) {
		int row = -1;
		int column = -1;
		boolean turn = true;
		Scanner input = new Scanner(System.in);
		String[][] playerOutput = {
				{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}
		};

		System.out.println("_____________");
		System.out.println("|   |   |   |");
		System.out.println("_____________");
		System.out.println("|   |   |   |");
		System.out.println("_____________");
		System.out.println("|   |   |   |");
		System.out.println("_____________");

		while (playerOutput[0][0].contains(" ") || playerOutput[0][1].contains(" ") || playerOutput[0][2].contains(" ")
				|| playerOutput[1][0].contains(" ") || playerOutput[1][1].contains(" ") || playerOutput[2][1].contains(" ")
				|| playerOutput[2][0].contains(" ") || playerOutput[2][1].contains(" ") || playerOutput[2][2].contains(" ")
				) {

			if (turn) {
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
				row = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				column = input.nextInt();

				if (playerOutput[row][column] == " ") {
					playerOutput[row][column] = "X";
					turn = !turn;
				}
				else {
					System.out.println("That space is already filled.");
					continue;
				}
			}

			else {
				System.out.print("Enter a row (0, 1, or 2) for player O: ");
				row = input.nextInt();
				System.out.print("Enter a column (0, 1, or 2) for player O: ");
				column = input.nextInt();

				if (playerOutput[row][column] == " ") {
					playerOutput[row][column] = "O";
					turn = !turn;
				}
				else {
					System.out.println("That space is already filled.");
					continue;
				}
			}

			System.out.println("_____________");
			System.out.println("| " + playerOutput[0][0] + " | " + 
					playerOutput[0][1] + " | " + playerOutput[0][2] + " |");
			System.out.println("_____________");
			System.out.println("| " + playerOutput[1][0] + " | " + 
					playerOutput[1][1] + " | " + playerOutput[1][2] + " |");
			System.out.println("_____________");
			System.out.println("| " + playerOutput[2][0] + " | " + 
					playerOutput[2][1] + " | " + playerOutput[2][2] + " |");
			System.out.println("_____________");

		}

	}

}
