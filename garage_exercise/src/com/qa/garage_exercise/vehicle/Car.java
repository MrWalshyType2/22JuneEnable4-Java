package com.qa.garage_exercise.vehicle;

import com.qa.garage_exercise.vehicle.parts.Engine;

public class Car extends Vehicle {

	public Car(String manufacturer, String model, Engine engine) {
		super(manufacturer, model, engine, "CAR");
	}

	@Override
	public void move(String direction) {
		System.out.println("Car moves " + direction);
	}

	@Override
	public void noise(float decibels) {
		System.out.println("Noise level: " + decibels);
	}

	@Override
	public void light(String light) {
		System.out.println("Car activates light " + light);
	}

}
