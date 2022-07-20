package com.qa.garage_exercise.vehicle.parts;

import java.util.Objects;

public class Engine {

	private String engineType;

	public Engine(String engineType) {
		this.engineType = engineType;
	}
		
	public String getEngineType() {
		return engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(engineType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Objects.equals(engineType, other.engineType);
	}
	
	
}