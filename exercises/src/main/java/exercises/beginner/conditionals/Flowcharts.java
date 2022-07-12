package exercises.beginner.conditionals;

public class Flowcharts {

	public int question1(int num1, int num2, boolean isAddition) {
		
		if (isAddition == true) {
			return num1 + num2;
		} 
		else {
			return num1 * num2;
		}
		
	}
	
	public void question2(int a) {
		
		int input = a;
		
		if (input > 2000) {
			System.out.println(input);
			if (input > 6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if (input > 4000) {
					System.out.println("D");
				}
				else {
					System.out.println("E");
				}
			}		
		}
		else {
			System.out.println("1");
			if (input > 100) {
				System.out.println("3");
				if (input > 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if (input > 500) {
						System.out.println("6");
					}
					else {
						System.out.println("7");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
		
	}
}
