package com.qa.inheritance_and_polymorphism.animals;

import com.qa.inheritance_and_polymorphism.classifications.Vertebrate;

public class Dog extends Vertebrate {

	// We don't need a constructor in Dog by default as we have a zero-arg constructor
	// in Vertebrate
	// - When Java inserts a default constructor, it adds super() to the first line of it
	
	public Dog() {
		this.species = "Unknown";
	}
	
	public Dog(String species) {
		if (species == null) {
			throw new NullPointerException("Classification cannot be null.");
		} else if (species.isBlank()) {
			throw new IllegalArgumentException("The provided classification cannot be empty.");
		}
		this.species = species;
	}
}
