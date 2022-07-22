package com.qa.garage_exercise;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage_exercise.vehicle.Car;

public class CarGarage extends Garage<Car> {
	
	public CarGarage() {
		this(new ArrayList<Car>(), 75);
	}

	public CarGarage(List<Car> cars, int baseRepairCost) {
		super(cars, baseRepairCost);
	}

	@Override
	protected int calculateCost(Car vehicle) {
		return baseRepairCost * 3;
	}

}
