package com.qa.inheritance_and_polymorphism.classifications;

import com.qa.inheritance_and_polymorphism.animals.Animal;

// to inherit from another class, we use the extends keyword
// followed by the name of the class
// - we can only inherit from one class
public abstract class Vertebrate extends Animal {

	// If we inherit from a class that does not have a zero-argument
	// constructor, we must provide a constructor that calls the one
	// in the super class
	
	// One instance where we don't have a zero-arg constructor:
	// - If we provide a constructor in the superclass that takes at least 1 arg
	//   and don't also provide a zero-arg constructor
	public Vertebrate() {
		// To solve the issue of there being no empty constructor
		// in the parent class, we must call the constructor
		// that is present in the parent class.
		
		// To call the parent classes constructor, we must use
		// the super keyword
		super("Verterbrate");
	}
	
	public Vertebrate(String species) {
		super("Verterbrate");
		if (species == null) {
			throw new NullPointerException("Classification cannot be null.");
		} else if (species.isBlank()) {
			throw new IllegalArgumentException("The provided classification cannot be empty.");
		}
		this.species = species;
	}

}
