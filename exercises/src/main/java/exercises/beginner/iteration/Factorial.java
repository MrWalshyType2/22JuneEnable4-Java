package exercises.beginner.iteration;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorialOf(4)); // 24
		System.out.println(f.factorialOf(5)); // 120
		System.out.println(f.factorialOf(7)); // 5040
		System.out.println(f.factorialOf(13)); // 6227020800
		
		System.out.println(f.recursiveFactorialOf(14));
				
		// 1st call: return 4 * recursiveFactorialOf(3)
		// 2nd call: return 3 * rec(2)
		// 3rd call: return 2 * rec(1)
		// 4th call: return 1
	}

		// 5! = 5 * 4 * 3 * 2
	public int factorialOf(int num) {
		int sum = num;
		for (int i = num - 1; i > 1; i--) {
			sum *= i;
		}
		return sum;
	}
	
	public int recursiveFactorialOf(int num) {
		if (num <= 1) return 1;
 		return num * recursiveFactorialOf(num - 1);
	}
}
