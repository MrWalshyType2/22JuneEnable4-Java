package exercises.beginner.iteration;

public class FibonacciNumbers {
	
	public static void main(String[] args) {
		FibonacciNumbers fn = new FibonacciNumbers();
		int[] sequence = fn.generateFibonacciSequence(10);
		
		for (var e : sequence) {
			System.out.println(e);
		}
	}

	// 0, 1, 1, 2, 3, 5, 8, etc....
	// Fibonacci sequence, each number is the sum of the prior two
	public int[] generateFibonacciSequence(int length) {
		int[] sequence = new int[length];
		sequence[0] = 0;
		sequence[1] = 1;
		
		for (int i = 2; i < length; i++) {
			sequence[i] = sequence[i - 1] + sequence[i - 2];
		}
		
		return sequence;
	}
	
}
