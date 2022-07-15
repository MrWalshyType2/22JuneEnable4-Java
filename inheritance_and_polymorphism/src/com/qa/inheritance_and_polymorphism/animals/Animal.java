package com.qa.inheritance_and_polymorphism.animals;

import java.util.Objects;

public class Animal {

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
		System.out.println("the overridden equals which can be applied to any object:");
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
