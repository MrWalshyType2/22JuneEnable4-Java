package com.qa.anonymous_classes_interfaces_and_lambdas.interface_example;

// the implements keyword is used to inherit from an
// interface
// - we can implement multiple interfaces by separating
//   their names with a comma
// - we can only extend one class though
public class WalkingBehaviour implements MovementBehaviour {
	
	public void walk(String name) {
		System.out.println(name + " is walking");
	}

	@Override
	public void move(Player player) {
		walk(player.getName());
	}
}
