package exercises.beginner.conditionals;

public class CalculatorRevisited {

	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	public void divide(double num1, double num2) {
		
		if ((int)num2 == 0) {
			System.out.println("Cannot divide by zero");;
		}	else System.out.print(num1/num2);
		
	}
}
