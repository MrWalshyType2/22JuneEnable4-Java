package com.qa.garage_exercise;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage_exercise.vehicle.Car;
import com.qa.garage_exercise.vehicle.Motorbike;
import com.qa.garage_exercise.vehicle.Vehicle;

public abstract class Garage<T extends Vehicle> {
	
	public static long idCounter = 1;
	private List<T> vehicles;
	protected int baseRepairCost; // pounds

	public Garage() {
		this.vehicles = new ArrayList<>();
		this.baseRepairCost = 50;
	}

	public Garage(List<T> vehicles, int baseRepairCost) {
		this.vehicles = vehicles;
		this.baseRepairCost = baseRepairCost;
	}

	public void add(T vehicle) {
		// make sure the vehicle doesn't already exist
		// - iterate over to do so
		for (var vehicleInGarage : vehicles) {
			if (vehicleInGarage.equals(vehicle)) {
				throw new RuntimeException("Vehicle already exists");
			}
		}
		// exception wasn't thrown, so add the vehicle
		vehicle.setId(idCounter++);
		this.vehicles.add(vehicle);
	}

	public List<String> getBills() {
		List<String> bills = new ArrayList<>();
		
		for (var vehicle : vehicles) {
			int cost = calculateCost(vehicle);
			bills.add("The total cost of the repair is £" + cost + " for vehicle: " + vehicle.toString());
		}
		return bills;
	}

	protected String getBill(long id) {
		// find the vehicle
		// - calculate its bill if it exists
		// - otherwise throw an exception stating that it doesn't exist
		for (int i = 0; i < vehicles.size(); i++) {
			var current = vehicles.get(i);
			if (current.getId() == id) {
				int cost = calculateCost(current);
				return "The total cost of the repair is £" + cost;
			}
		}
		throw new RuntimeException("Vehicle with the given ID does not exist: " + id);
	}

	public String fix(long id) {
		return getBill(id);
	}

	public T remove(long id) {
		// What kind of problem is this?
		// - search problem (finding the element with the given id)
		for (int i = 0; i < vehicles.size(); i++) {
			var current = vehicles.get(i);
			if (current.getId() == id) {
				return vehicles.remove(i);
			}
		}
		throw new RuntimeException("Vehicle with the given ID does not exist: " + id);
	}

	public T remove(T vehicle) {
		// What kind of problem is this?
		// - search problem (finding the element with the given type)
		for (int i = 0; i < vehicles.size(); i++) {
			var current = vehicles.get(i);
			if (current.equals(vehicle)) {
				return vehicles.remove(i);
			}
		}
		throw new RuntimeException("Vehicle does not exist: " + vehicle.toString());
	}

	public List<T> empty() {
		var oldVehicles = vehicles;
		vehicles = new ArrayList<>();
		return oldVehicles;
	}

	public List<T> empty(String type) {
		List<T> vehiclesToRemove = new ArrayList<>();
		
		for (var vehicle : vehicles) {
			if (vehicle.getType().equals(type)) {
				vehiclesToRemove.add(vehicle);
			}
		}
		vehicles.removeAll(vehiclesToRemove);
		
		return vehiclesToRemove;
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}
	
	protected abstract int calculateCost(T vehicle);
}
