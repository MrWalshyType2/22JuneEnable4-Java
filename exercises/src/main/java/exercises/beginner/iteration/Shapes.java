package exercises.beginner.iteration;

public class Shapes {
	
	public static void main(String[] args) {
		Shapes shapes = new Shapes();
		shapes.printRightAngledTriangle();
	}
	
	// Common constraints:
	// - one or more iterative statements must be used
	// - Each one of the specified print statements can only be used once

	void printRightAngledTriangle() {
		for (int line = 1; line <= 5; line++) {			
			for (int column = 1; column <= line; column++) {
				System.out.print('#');
			}
			System.out.print('\n');
		}
	}

	void printInvertedRightAngledTriangle() {

	}

	void printLeftAngledTriangle() {
		
	}

	void printInvertedLeftAngledTriangle() {

	}
	
	void printAcuteTriangle() {
		
	}
	
	void printZigZag() {
		
	}
	
	void printCircle() {
		
	}
}
