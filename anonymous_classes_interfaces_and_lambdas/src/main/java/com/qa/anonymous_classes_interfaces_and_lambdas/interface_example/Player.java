package com.qa.anonymous_classes_interfaces_and_lambdas.interface_example;

public class Player {

	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void move(MovementBehaviour behaviour) {
		behaviour.move(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
