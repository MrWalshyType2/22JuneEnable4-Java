package com.qa.garage_exercise;

import java.util.List;

import com.qa.garage_exercise.vehicle.Car;
import com.qa.garage_exercise.vehicle.Motorbike;
import com.qa.garage_exercise.vehicle.Vehicle;
import com.qa.garage_exercise.vehicle.parts.Engine;

public class Runner {

	public static void main(String[] args) {
		Engine electricEngine = new Engine("ELECTRIC");
		Engine combustionEngine = new Engine("COMBUSTION");
		
		Vehicle mazda = new Car("Mazda", "RX-7", combustionEngine);
		Vehicle bmw = new Motorbike("BMW", "r500", combustionEngine);
//		System.out.println(mazda);
		
		Garage garage = new Garage();
		garage.add(mazda);
		garage.add(bmw);
//		Vehicle v = garage.remove(1);
		
//		var carsRemoved = garage.empty("CAR");
//		System.out.println(carsRemoved);
//		System.out.println(garage);
		
		List<String> bills = garage.getBills();
		
		for (var bill : bills) {
			System.out.println(bill);
		}
	}

}
