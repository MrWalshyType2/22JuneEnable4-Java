package com.qa.inheritance_and_polymorphism.animals;

import java.util.Objects;

import com.qa.inheritance_and_polymorphism.classifications.Vertebrate;

public class Dog extends Vertebrate {
	
	private String name;

	// We don't need a constructor in Dog by default as we have a zero-arg constructor
	// in Vertebrate
	// - When Java inserts a default constructor, it adds super() to the first line of it
	
	public Dog(String name) {
		super();
		this.name = name;
	}
	
	public Dog(String species, String name) {
		super(species);
		this.name = name;
	}
	
	public void woof() {
		System.out.println("woof woof");
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n" + super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("the overridden equals in Dog which can be applied to any object:");
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public void makeNoise() {
		woof();
	}
	
	
}
