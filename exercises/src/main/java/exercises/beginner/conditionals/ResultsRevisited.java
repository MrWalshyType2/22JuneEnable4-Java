package exercises.beginner.conditionals;

public class ResultsRevisited {

	// do not change
	int physics;
	int chemistry;
	int biology;

	int total;
	int percentage;

	public void displayResults() {
		
		total = physics + chemistry + biology;
		percentage = total * 100 / 450;
		
		
		int physPct = (physics*100)/150;
		int chemPct = (chemistry*100)/150;
		int bioPct = (biology*100)/150;
		if (physPct < 60 && chemPct < 60) {
			failedPhysics(physics);
			failedChem(chemistry);
			failure(percentage);
		} else if (physPct < 60 && bioPct < 60) {
			failedPhysics(physics);
			failedBio(biology);
			failure(percentage);
		} else if (bioPct < 60 && chemPct < 60) {
			failedBio(biology);
			failedChem(chemistry);
			failure(percentage);
		}
		
		if (physPct < 60) {
			failedPhysics(physics);
			failure(percentage);
		} 
		else if (chemPct < 60){ 
			failedChem(chemistry);
			failure(percentage);
		}
		else if (bioPct < 60) {
			failedBio(biology);
			failure(percentage);
		}
		else {
			String header = "###############\n"
					+ "# EXAM SCORES #\n"
					+ "###############";
			System.out.println(header);
			
			System.out.println("PHYSICS: " + physics + "/150");
			System.out.println("CHEMISTRY: " + chemistry + "/150");
			System.out.println("BIOLOGY: " + biology + "/150");
			System.out.println("");
			System.out.println("TOTAL SCORE: " + total + "/450");
			displayPercentage();
		}
	}
	
	public void displayPercentage() {
		total = physics + chemistry + biology;
		percentage = total * 100 / 450;
		
		System.out.println("PASSED: " + percentage + "%");
	}
	
	public void failedPhysics(int phys) {
		System.out.println("FAILED PHYSICS: " + ((phys*100)/150) + "%");
	}
	
	public void failedChem(int chem) {
		System.out.println("FAILED CHEMISTRY: " + ((chem*100)/150) + "%");
	}
	
	public void failedBio(int bio) {
		System.out.println("FAILED BIOLOGY: " + ((bio*100)/150) + "%");
	}

	public void failure(int totalPercentage) {
		
		System.out.println("FAILED: " + (totalPercentage) + "%");
	}
	
}
