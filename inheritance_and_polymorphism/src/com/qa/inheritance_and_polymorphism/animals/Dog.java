package com.qa.inheritance_and_polymorphism.animals;

import java.util.Objects;

import com.qa.inheritance_and_polymorphism.classifications.Vertebrate;

public class Dog extends Vertebrate {

	// We don't need a constructor in Dog by default as we have a zero-arg constructor
	// in Vertebrate
	// - When Java inserts a default constructor, it adds super() to the first line of it
	
	public Dog() {
		super();
	}
	
	public Dog(String species) {
		super(species);
	}
	
	public void woof() {
		System.out.println("woof woof");
	}
	
}
