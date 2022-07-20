package com.qa.anonymous_classes_interfaces_and_lambdas.interface_example;

public interface MovementBehaviour {

	int X = 50; // cannot be reassigned, public static final
	// interfaces are similar to abstract classes except
	// we do not have instance variables and methods
	// are public and abstract by default.
	// - we can have static variables, but these are
	//   public and final by default

	void move(Player player);
	
	// we can also have default methods
	// - these have an implementation
	default void printX() {
		System.out.println(MovementBehaviour.X);
	}
}
