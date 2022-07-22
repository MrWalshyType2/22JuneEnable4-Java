package com.qa.garage_exercise;

import java.util.List;

import com.qa.garage_exercise.vehicle.Car;
import com.qa.garage_exercise.vehicle.Motorbike;
import com.qa.garage_exercise.vehicle.Moveable;
import com.qa.garage_exercise.vehicle.Vehicle;
import com.qa.garage_exercise.vehicle.parts.Engine;

public class Runner {

	public static void main(String[] args) {
		Engine electricEngine = new Engine("ELECTRIC");
		Engine combustionEngine = new Engine("COMBUSTION");
		
		Car mazda = new Car("Mazda", "RX-7", combustionEngine);
		Motorbike bmw = new Motorbike("BMW", "r500", combustionEngine);
//		System.out.println(mazda);
		
		Garage<Motorbike> garage = new BikeGarage();
//		garage.add(mazda);
		garage.add(bmw);
		
		Garage<Car> carGarage = new CarGarage();
		carGarage.add(mazda);
//		carGarage.add(bmw);
//		Vehicle v = garage.remove(1);
		
//		var carsRemoved = garage.empty("CAR");
//		System.out.println(carsRemoved);
//		System.out.println(garage);
		
		List<String> bills = carGarage.getBills();
		
		for (var bill : bills) {
			System.out.println(bill);
		}
		
		bills = garage.getBills();
		
		for (var bill : bills) {
			System.out.println(bill);
		}
		
//		parkVehicle(mazda);
//		parkVehicle(bmw);
	}

	public static void parkVehicle(Moveable moveable) {
		moveable.move("to parking lot");
	}
}
