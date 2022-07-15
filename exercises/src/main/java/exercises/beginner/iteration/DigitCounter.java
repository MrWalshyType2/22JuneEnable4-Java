package exercises.beginner.iteration;

public class DigitCounter {
	
	public static void main(String[] args) {
		var dc = new DigitCounter();
		int digits = dc.numOfDigits(1234534);
		System.out.println(digits);
		
		System.out.println(dc.recursiveNumOfDigits(123456));
	}

	public int numOfDigits(int number) {
		int numOfDigits = 0;
		int num = number;
		
		while (num != 0) {
			num /= 10;
			numOfDigits++;
		}
		
		return numOfDigits;
	}
	
	public int recursiveNumOfDigits(int number) {
		if (number == 0) return 0;
		return 1 + recursiveNumOfDigits(number / 10);
	}
}
