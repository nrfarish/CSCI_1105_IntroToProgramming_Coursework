/**
 * This is a program that plays as a locker puzzle game
 * 
 * @author Nic Farish
 *03/04/20
 */
public class lockerPuzzle {

	public static void main(String[] args) {

		String myString = "";
		boolean[] lockerList = new boolean[100];
		for (int i = 0; i < lockerList.length; i++) {
			lockerList[i] = false;
		}
		
		lockers(lockerList);
		
		for (int i = 0; i < lockerList.length; i++) {
			if (lockerList[i] == true) {
				myString = myString + (i + 1) + " ";
			}
		}
		
		System.out.println("The open lockers are: " + myString);
	}

	public static void lockers(boolean[] array) {
		
		for (int i = 0; i < 100; i++) {

			for (int j = i; j < array.length; j++) {
				if((j + 1) % (i + 1) == 0)
					array[j] = !array[j];
			}
		}

	}

}