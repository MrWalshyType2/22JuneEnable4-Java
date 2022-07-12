package exercises.beginner.conditionals;

public class FizzBuzz {

	// returns 'Fizz' for multiples of 3
	// returns 'Buzz' for multiples of 5
	// returns 'FizzBuzz' for multiples of both 3 and 5
	// returns input number for numbers that are neither
	public String play(int input) {
	
		String result;
		
		if (input % 3 ==0 && input % 5 == 0) {
			return "FizzBuzz";
		}
		else if (input % 3 == 0) {
			return "Fizz";
		}
		else if (input % 5 == 0) {
			return "Buzz";
		}
		
		
		return String.valueOf(input);
	}
}
