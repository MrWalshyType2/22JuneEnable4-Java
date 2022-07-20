package com.qa.anonymous_classes_interfaces_and_lambdas.anon_class_example;

import java.util.Objects;

public abstract class Vehicle {

	// fields
	private long id;
	private String manufacturer;
	private String model;
	private String type;

	// constructors
	public Vehicle(String manufacturer, String model, String type) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.type = type;
	}

	// methods
	public abstract void move(String direction);
	public abstract void noise(float decibels);
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
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, manufacturer, model, type);
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
		return id == other.id
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(model, other.model)
				&& Objects.equals(type, other.type);
	}
}
