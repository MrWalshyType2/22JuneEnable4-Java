package exercises.beginner.operators;

public class Results {

	public int physicsScore;
	public int chemistryScore;
	public int biologyScore;
	
	public int totalScore;
	public int percentage;
	
	public void displayResults() {
		totalScore = physicsScore + chemistryScore + biologyScore;
		String header = "###############\r\n"
				+ "# EXAM SCORES #\r\n"
				+ "###############";
		System.out.println(header);
		
		System.out.println("PHYSICS: " + physicsScore);
		System.out.println("CHEMISTRY: " + chemistryScore);
		System.out.println("BIOLOGY: " + biologyScore);
		System.out.println();
		System.out.println("TOTAL SCORE: " + totalScore + "/450");
		displayPercentage();

	}
	
	/**
	 * Prints the total score of all exams as a percentage from 1 to 100.
	 * 
	 * @return
	 */
	public void displayPercentage() {
		totalScore = physicsScore + chemistryScore + biologyScore;
		percentage = totalScore * 100 / 450;
		System.out.println("PERCENTAGE: " + percentage + "%");
	}
}
