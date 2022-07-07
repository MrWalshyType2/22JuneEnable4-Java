package com.qa.user_defined_classes;

import com.qa.user_defined_classes.model.Car;

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
	}

}
