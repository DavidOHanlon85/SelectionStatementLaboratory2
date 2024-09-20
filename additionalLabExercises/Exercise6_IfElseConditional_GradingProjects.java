package additionalLabExercises;

public class Exercise6_IfElseConditional_GradingProjects {

	public static void main(String[] args) {

		// Declare and Initialise Variables

		int projectScore = 196;
		String feedback;

		// Set up If/ Else Conditional

		if (projectScore > 69 && projectScore <= 100) {
			feedback = "Wonderful";
		} else if (projectScore > 59 && projectScore <= 69) {
			feedback = "Commendation";
		} else if (projectScore > 49 && projectScore <= 59) {
			feedback = "Pass";
		} else if (projectScore >= 0 && projectScore <= 49) {
			feedback = "Fail";
		} else {
			feedback = "Invalid input";
		}

		System.out.println(feedback);
	}

}
