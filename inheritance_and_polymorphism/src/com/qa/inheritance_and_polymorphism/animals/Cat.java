package com.qa.inheritance_and_polymorphism.animals;

import com.qa.inheritance_and_polymorphism.classifications.Vertebrate;

public class Cat extends Vertebrate {
	
	public Cat(String species) {
		this.species = species;
	}

	@Override
	public void makeNoise() {
		System.out.println("meow");
	}
}
