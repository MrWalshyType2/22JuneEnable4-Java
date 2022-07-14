package com.qa.inheritance_and_polymorphism;

import com.qa.inheritance_and_polymorphism.animals.Animal;
import com.qa.inheritance_and_polymorphism.animals.Dog;
import com.qa.inheritance_and_polymorphism.classifications.Vertebrate;

public class Runner {

	public static void main(String[] args) {
//		Animal animal = new Animal(null); // throws a null pointer exception
//		Animal animal = new Animal(""); // throws an illegal arg exception
		Animal animal = new Animal("Invertabrate");
		System.out.println(animal.getClassification());
		
		Vertebrate vertabrate = new Vertebrate();
		System.out.println(vertabrate.getClassification());
		
		Dog dog = new Dog();
		System.out.println(dog.getSpecies());
		
		Dog mininiaturePinscher = new Dog("Miniature Pinscher");
		System.out.println(mininiaturePinscher.getSpecies());
	}

}
