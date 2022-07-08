package com.qa.user_defined_classes;

import com.qa.user_defined_classes.model.Car;
import com.qa.user_defined_classes.model.Song;

public class Runner {

	public static void main(String[] args) {
		// creating a new object of type Car
		// - when we call new, it is followed by something called a 
		//   constructor
		Car car = new Car();
		Car otherCar = new Car();
		
		// we can use dot notation to access the data on the car object
		System.out.println(car.getManufacturer()); // null
		// car.manufacturer is null because we haven't initialised it
		// with a different value
		System.out.println(car.numOfDoors); // 0
		
		// we can also change the value of an instance variable
		car.setManufacturer("Mazda");
		car.numOfSeats = 200;
		car.engineSize = 355f;
		
		System.out.println(car.getManufacturer()); // "Mazda"
		
		// We can call displayInfo on an instance (object) of Car
		// but we cannot call it directly through the class
//		Car.displayInfo(); // illegal
		car.displayInfo(); // legal
		otherCar.displayInfo();
		
		Car myCar = new Car();
		myCar.setManufacturer("324342");
		myCar.displayInfo();
		
		
		
		Song song = new Song();
		
		
		// In Java, 
		//  - a whole number literal is an integer by default
		//  - a decimal number literal is a double by default
		song.setSeconds(435);
		var seconds = song.getSeconds();
		System.out.println(seconds);
		
		// 1. Always initialise the variable on the same line the var keyword is used
		// 2. Get the data type from the righthand side of the assignment and
		//    replace var with that type
		
		
		
		
		// Widening and narrowing types:
		// byte -> short -> int -> long -> float -> double
		byte b = 1; 
		// What data type is 1 before it has been assigned?
		// - an int
		short s = 288;
		int i = 243244342;
		long l = 432432442432432423L;
		float f = 44.58F;
		double d = f; 
		// we can assign a float to a double because it is smaller 
		
		// Taking a value of a smaller numeric data type and putting it in a 
		// variable of a larger data type is known as widening the type
		
		// Narrowing is the opposite, putting a larger value in a variable of a smaller
		// data type
		// - this is done using the cast operator
		int someNumber = ((int) 24234234234324234L); // type casted a long to an int
		// - we lose accuracy when we cast larger numbers to smaller types
//		System.out.println(someNumber);
		
		// Integer overflow and underflow
		int maximumValue = Integer.MAX_VALUE;
		int smallestValue = Integer.MIN_VALUE;
		System.out.println(maximumValue);
		System.out.println(maximumValue + 2);
		System.out.println();
		System.out.println(smallestValue);
		System.out.println(smallestValue - 1);
		
		// floating-point precision
		// - decimal numbers are inherently imprecise
		// - we get the closest approximation to the result of a desired calculation
		System.out.println();
		System.out.println(f + 0.05);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
