package exercises.beginner.operators;

public class Results {

	public int physicsScore;
	public int chemistryScore;
	public int biologyScore;
	
	public int totalScore;
	public int percentage;
	
	public void displayResults() {
<<<<<<< Updated upstream
		totalScore = physicsScore + chemistryScore + biologyScore;
		String header = "###############\r\n"
				+ "# EXAM SCORES #\r\n"
=======
		
		totalScore = physicsScore + chemistryScore + biologyScore;
		
		String header = "###############\n"
				+ "# EXAM SCORES #\n"
>>>>>>> Stashed changes
				+ "###############";
		System.out.println(header);
		
		System.out.println("PHYSICS: " + physicsScore);
		System.out.println("CHEMISTRY: " + chemistryScore);
		System.out.println("BIOLOGY: " + biologyScore);
<<<<<<< Updated upstream
		System.out.println();
		System.out.println("TOTAL SCORE: " + totalScore + "/450");
		displayPercentage();

=======
		System.out.println("");
		System.out.println("TOTAL SCORE: " + totalScore + "/450");
		displayPercentage();
		
>>>>>>> Stashed changes
	}
	
	/**
	 * Prints the total score of all exams as a percentage from 1 to 100.
	 * 
	 * @return
	 */
	public void displayPercentage() {
		totalScore = physicsScore + chemistryScore + biologyScore;
		percentage = totalScore * 100 / 450;
<<<<<<< Updated upstream
=======
		
>>>>>>> Stashed changes
		System.out.println("PERCENTAGE: " + percentage + "%");
	}
}
