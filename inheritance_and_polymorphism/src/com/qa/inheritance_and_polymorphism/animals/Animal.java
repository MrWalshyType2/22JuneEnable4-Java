package com.qa.inheritance_and_polymorphism.animals;

public class Animal {

	protected int age;
	protected String classification;
	protected String species;
	protected String sex;
	
	public Animal(String classification) {
		if (classification == null) {
			throw new NullPointerException("Classification cannot be null.");
		} else if (classification.isBlank()) {
			throw new IllegalArgumentException("The provided classification cannot be empty.");
		}
		this.classification = classification;
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
	
}
