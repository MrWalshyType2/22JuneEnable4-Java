package com.qa.garage_exercise.vehicle;

import com.qa.garage_exercise.vehicle.parts.Engine;

public class Motorbike extends Vehicle {

	public Motorbike(String manufacturer, String model, Engine engine) {
		super(manufacturer, model, engine, "BIKE");
	}

	@Override
	public void move(String direction) {
		System.out.println("Bike moves " + direction);
	}

	@Override
	public void noise(float decibels) {
		System.out.println("Noise level: " + decibels);
	}

	@Override
	public void light(String light) {
		System.out.println("Bike activates light " + light);
	}

}
