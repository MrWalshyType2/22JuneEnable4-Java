package com.qa.classes_and_objects;

public class Runner {

	public static void main(String[] args) {
		Animal a1 = new Animal("Zebra");
		Animal a2 = new Animal("Eagle");
		new Animal(2);
		a1.printInfo(); // Zebra
		a2.printInfo(); // Eagle
		a1.eat(); // prints: "Searching for some food"
		a1.eat("peach"); // prints: "Nom nom nom... peach"
	}
}
