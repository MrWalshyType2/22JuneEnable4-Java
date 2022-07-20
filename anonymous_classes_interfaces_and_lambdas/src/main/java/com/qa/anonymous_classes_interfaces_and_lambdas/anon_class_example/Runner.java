package com.qa.anonymous_classes_interfaces_and_lambdas.anon_class_example;

public class Runner {

	public static void main(String[] args) {
		// Anonymous classes are implementations of an abstract class or interface
		// that has been declared and used in the source code of a method
		Vehicle vehicle = new Vehicle("Mazda", "RX-7", "CAR") {

			// this implementation of Vehicle is an anonymous class, it is used
			// only once to create the vehicle object above
			@Override
			public void move(String direction) {
				System.out.println("Moving " + direction);
			}

			@Override
			public void noise(float decibels) {
				System.out.println("Noise: " + decibels);
			}

			@Override
			public void light(String light) {
				System.out.println("Light signal: ");
			}
		};
		
		
	}
	
	// creates an instance of an anonymous class
	public Vehicle createUnidentifiedVehicle(String manufacturer, String model) {
		return new Vehicle(manufacturer, model, "UNIDENTIFIED") {

			@Override
			public void move(String direction) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void noise(float decibels) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void light(String light) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}

