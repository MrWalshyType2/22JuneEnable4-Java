package exercises.beginner.arrays;

public class GenerateArray {
	
	public static void main(String[] args) {
		var ga = new GenerateArray();
		int[] multiples = ga.multiplesOf(7, 7);
		
		for (int i = 0; i < multiples.length; i++) {
			System.out.println(multiples[i]);
		}
	}

	// Create a method that given two integer inputs, a multiple and a number representing how many
	// multiples should be generated. The method should return an integer array of multiples, for example:
	//
	// multiplesOf(5, 3); // [5, 10, 15]
	//
	// If the count is less than 1, you must return an empty array.
	
	public int[] multiplesOf(int multiple, int count) {
		if (count < 1) return new int[0];
		int[] arr = new int[count];
		arr[0] = multiple;
		
		// i = 1 as index 0 is the multiple, the initial number
		for (int i = 1; i < count; i++) {
			arr[i] = multiple * (i + 1); // add 1 to i as the number to multiply by is 1 behind each iteration
		}
		return arr;
	}
}
