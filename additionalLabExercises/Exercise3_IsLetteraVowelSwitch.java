/**
 * 
 */
package additionalLabExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise3_IsLetteraVowelSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Initialise Variables

		String inputLetter, letter;

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		// Prompt User

		System.out.println("Give me a letter of the alphabet");

		// Receive input

		inputLetter = myScan.nextLine();

		// Set up Switch Statement

		switch (inputLetter) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			letter = "a vowel";
			break;
		case "b":
		case "c":
		case "d":
		case "f":
		case "g":
		case "h":
		case "j":
		case "k":
		case "l":
		case "m":
		case "n":
		case "p":
		case "q":
		case "r":
		case "s":
		case "t":
		case "v":
		case "w":
		case "x":
		case "y":
		case "z":
			letter = "a consonant";
			break;
		default:
			letter = "an invalid input";
			break;
		}

		System.out.printf("Your letter is %s.", letter);
		
		// Close scanner
		
		myScan.close();

	}

}
