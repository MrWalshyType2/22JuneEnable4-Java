package com.qa.garage_exercise.vehicle;

import java.util.Objects;

import com.qa.garage_exercise.vehicle.parts.Engine;

public abstract class Vehicle implements Moveable, NoiseProducer {

	// fields
	private long id;
	private String manufacturer;
	private String model;
	private Engine engine;
	private String type;

	// constructors
	public Vehicle(String manufacturer, String model, Engine engine, String type) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.engine = engine;
		this.type = type;
	}

	// methods
	public abstract void light(String light);
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", engine=" + engine
				+ ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(engine, id, manufacturer, model, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(engine, other.engine) && id == other.id
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(model, other.model)
				&& Objects.equals(type, other.type);
	}
}
