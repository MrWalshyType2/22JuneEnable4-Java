package com.qa.garage_exercise;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage_exercise.vehicle.Car;
import com.qa.garage_exercise.vehicle.Motorbike;

public class BikeGarage extends Garage<Motorbike> {
	
	public BikeGarage() {
		this(new ArrayList<Motorbike>(), 25);
	}

	public BikeGarage(List<Motorbike> cars, int baseRepairCost) {
		super(cars, baseRepairCost);
	}

	@Override
	protected int calculateCost(Motorbike vehicle) {
		return baseRepairCost * 2;
	}

}
