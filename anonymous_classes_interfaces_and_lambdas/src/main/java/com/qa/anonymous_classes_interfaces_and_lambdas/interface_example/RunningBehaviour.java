package com.qa.anonymous_classes_interfaces_and_lambdas.interface_example;

public class RunningBehaviour implements MovementBehaviour {

	public void run(String name) {
		System.out.println(name + " is running");
	}

	@Override
	public void move(Player player) {
		run(player.getName());
	}
}
