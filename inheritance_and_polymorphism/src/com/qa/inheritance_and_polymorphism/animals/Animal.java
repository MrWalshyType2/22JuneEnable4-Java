package com.qa.inheritance_and_polymorphism.animals;

import java.util.Objects;

// adding the abstract keyword to a class declaration
// makes the class abstract
// - it means we cannot create an instance of the class anymore
public abstract class Animal {
	
	// abstract classes can function almost exactly like a class,
	// they can have fields and methods, whether they are abstract or
	// not.
  
	protected int age;
	protected String classification;
	protected String species;
	protected String sex;   
	
	public Animal(String classification) {
		super();
		if (classification == null) {
			throw new NullPointerException("Classification cannot be null.");
		} else if (classification.isBlank()) {
			throw new IllegalArgumentException("The provided classification cannot be empty.");
		}
		this.classification = classification;
		this.species = "Unknown";
	}
	
	// abstract methods do not have a body, they must be implemented
	// by the first concrete class which inherits from this class in this case
	// - a concrete class just a class that is not abstract
	// - abstract methods MUST BE in an abstract class
	public abstract void makeNoise();
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getClassification() {
		return classification;
	}
	
	// we can override methods in the parent class to give them a different
	// implementation
	// - method overriding is runtime polymorphism
	// - method overriding is also known as dynamic method dispatch
	@Override
	public String toString() {
		return "Species: " + species + "\nAge: " + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, classification, sex, species);
	}

	// annotation begin with @
	// - annotations are extra data describing a method
	// - to override a method, it is not necessary to specify @Override
	@Override
	public boolean equals(Object obj) {	
		System.out.println("the overridden equals in Animal which can be applied to any object:");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && Objects.equals(classification, other.classification)
				&& Objects.equals(sex, other.sex) && Objects.equals(species, other.species);
	}
	
}
