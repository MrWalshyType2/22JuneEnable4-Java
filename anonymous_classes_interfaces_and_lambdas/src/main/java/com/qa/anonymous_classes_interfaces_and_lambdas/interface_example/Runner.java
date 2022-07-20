package com.qa.anonymous_classes_interfaces_and_lambdas.interface_example;

public class Runner {

	public static void main(String[] args) {
		Player p1 = new Player("Fred");
		
		MovementBehaviour running = new RunningBehaviour();
		MovementBehaviour walking = new WalkingBehaviour();
		
		p1.move(running);
		p1.move(walking);
	}

}
