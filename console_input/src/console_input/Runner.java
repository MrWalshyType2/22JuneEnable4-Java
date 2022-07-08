package console_input;

import java.io.File;
import java.util.Scanner;

public class Runner {

	// To get console input, we need to create a Scanner
	public static Scanner sc = new Scanner(System.in);
	
	// - static means we don't need an instance of a class (Runner in this case) to use
	//   the field or method
	// i.e., instead of doing:
	//		Runner r = new Runner();
	//      String input = r.sc.nextLine();
	// we would do:
	// 		String input = Runner.sc.nextLine();
	//
	// The field or method is accessed through the class name rather than the name of a variable
	// storing a reference to an instance of the class.
	
	public static void main(String[] args) {
		System.out.println("Enter some input:");
		String input = Runner.sc.nextLine();
		System.out.println("You inputted: " + input);
		
		System.out.println("Enter age:");
		int age = Runner.sc.nextInt();
		System.out.println("your age is: " + age);
	}

}
