package exercises.beginner.conditionals;

public class UniqueSum {

	// unique sum
	// Given 3 integer values, return their sum where they are not equal to each other.
	public int play(int n1, int n2, int n3) {
		
		if (n1 == n2 && n2 == n3) {
			return 0;
		}
		
		if (n1 == n2) {
			return n3;
		}
		if (n1 == n3) {
			return n2;
		}
		if (n2 == n3) {
			return n1;
		}
		
		
		return n1 + n2 + n3;
	}
}
