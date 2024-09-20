/**
 * 
 */
package additionalLabExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise2_DayOfWeekSwtich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare and Initiate Variable

		int dayNumber;
		String dayOfWeek;

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		// Prompt User

		System.out.println("Give me a number between 1 - 7");
		dayNumber = myScan.nextInt();

		// Set up Switch Statement

		switch (dayNumber) {
		case 1:
			dayOfWeek = "Monday";
			break;
		case 2:
			dayOfWeek = "Tuesday";
			break;
		case 3:
			dayOfWeek = "Wednesday";
			break;
		case 4:
			dayOfWeek = "Thursday";
			break;
		case 5:
			dayOfWeek = "Friday";
			break;
		case 6:
			dayOfWeek = "Saturday";
			break;
		case 7:
			dayOfWeek = "Sunday";
			break;
		default:
			dayOfWeek = "Invalid response";
			break;
		}
		
		System.out.println("That would be : " + dayOfWeek);

		// Close Scanner
		
		myScan.close();
	}

}
