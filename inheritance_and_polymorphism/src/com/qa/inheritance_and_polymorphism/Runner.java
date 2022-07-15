package com.qa.inheritance_and_polymorphism;

import com.qa.inheritance_and_polymorphism.animals.Animal;
import com.qa.inheritance_and_polymorphism.animals.Dog;
import com.qa.inheritance_and_polymorphism.classifications.Vertebrate;

public class Runner {

	public static void main(String[] args) {
//		Animal animal = new Animal(null); // throws a null pointer exception
//		Animal animal = new Animal(""); // throws an illegal arg exception
//		Animal animal = new Animal("Invertabrate");
//		System.out.println(animal.getClassification());
		
//		Vertebrate vertabrate = new Vertebrate();
//		System.out.println(vertabrate.getClassification());
		
		Dog dog = new Dog();
		System.out.println(dog.getSpecies());
		
		Dog miniaturePinscher = new Dog("Miniature Pinscher");
		System.out.println(miniaturePinscher.getSpecies());
		miniaturePinscher.woof();
		System.out.println(miniaturePinscher.getClassification());
		
		// Subtype polymorphism in Java
		// - We can store a value of type B in a variable of type A if B inherits
		//   from A.
		// - We can store a subclass object in a variable of its parent class.
		Animal frenchy = new Dog("French Bulldog");
		// When we put a Dog object into an Animal variable, we lose sight of
		// anything specific to the Dog class:
		// - i.e., the `woof()` method
		// frenchy.woof(); // cannot do as Animal doesn't have a woof() method
		
		// We can check the type of a variables object using instanceof
		if (frenchy instanceof Dog) {
			// instanceof checks that:
			// - frenchy is not null
			// - frenchy is of type Dog
			
			// If we know the object is a Dog, we can narrow its type from Animal
			// to Dog
			// - this is done with type casting
			Dog someDog = ((Dog) frenchy);
			someDog.woof(); 
			// can call woof as we stored the ref to the object, which is a Dog, in the 
			// someDog variable
		}
		System.out.println(frenchy.getSpecies());
		
		// Polymorphic check:
		// - An object in Java is polymorphic if it passes at least 2 instanceof tests
		// All objects in Java are polymorphic as they pass 2 of these tests by default:
		// - every object inherits from the Object superclass implicitly
		// - every object is an instance of its own class
		if (frenchy instanceof Object) {
			System.out.println("The frenchy is an instanceof Object");
		}
		if (frenchy instanceof Dog) {
			System.out.println("The frenchy is an instanceof Dog");
		}
		if (frenchy instanceof Animal) {
			System.out.println("The frenchy is an instanceof Animal");
		}
		
		
		System.out.println(frenchy);
		System.out.println(frenchy.equals(frenchy));
		System.out.println(frenchy.equals(dog)); // false
		
		Animal dog1 = new Dog("Bulldog");
		Dog dog2 = new Dog("Bulldog");
		System.out.println(dog1.equals(dog2)); // true
		
		Animal someRandomDog = dog2;
	}

}
