/**
 * 
 */
package additionalLabExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise1_DayOfWeekIfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare and Initialse Variables

		int dayOfWeek = 0;

		// User Prompt

		System.out.println("Provide a number between 1 - 7");

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		dayOfWeek = myScan.nextInt();

		if (dayOfWeek == 1) {
			System.out.println("Monday");
		} else if (dayOfWeek == 2) {
			System.out.println("Tuesday");
		} else if (dayOfWeek == 3) {
			System.out.println("Wednesday");
		} else if (dayOfWeek == 4) {
			System.out.println("Thursday");
		} else if (dayOfWeek == 5) {
			System.out.println("Friday");
		} else if (dayOfWeek == 6) {
			System.out.println("Saturday");
		} else if (dayOfWeek == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid input");
		}

		myScan.close();
	}

}
