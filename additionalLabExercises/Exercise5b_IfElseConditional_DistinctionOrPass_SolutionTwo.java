package additionalLabExercises;

public class Exercise5b_IfElseConditional_DistinctionOrPass_SolutionTwo {

	public static void main(String[] args) {

		// Declare and Initialise Variables

		int studentScore = 87;
		String result = null;

		if (studentScore > 69 && studentScore <= 100) {
			result = "Distinction";
			} 
		else if (studentScore >+ 0 && studentScore < 70) {
			result = "Pass";
		}
		
		System.out.println(studentScore > 69 ? "Distinction" : "Pass");
		System.out.println(result);

	}

}
