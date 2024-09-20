/**
 * 
 */
package additionalLabExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise4_JavaMenuSelectionSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare Variables

		int userInput;
		String userSelection;

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		// Initial Prompt

		System.out.println("Menu");
		System.out.println("1. File");
		System.out.println("2. Add");
		System.out.println("3. Edit");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		System.out.println("Enter option...");

		// Accept number

		userInput = myScan.nextInt();
		myScan.nextLine();

		// Switch Statement

		switch (userInput) {
		case 1:
			userSelection = "File";
			break;
		case 2:
			userSelection = "Add";
			break;
		case 3:
			userSelection = "Edit";
			break;
		case 4:
			userSelection = "Delete";
			break;
		case 5:
			userSelection = "Exit";
			break;
		default:
			userSelection = "An invalid response";
		}
		
		System.out.printf("You selected: %s", userSelection);
		
		//Close Scanner
		
		myScan.close();
	}

}
