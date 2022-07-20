package com.qa.anonymous_classes_interfaces_and_lambdas.lambda_example;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Runner {

	public static void main(String[] args) {
		// SAM rule:
		// - Single Abstract Method
		// - If an interface contains a single abstract method,
		//   an anonymous implementation of it can be created
		//   using a lambda expression.
		// - An interface following the SAM rule is known as a functional interface
		
		// Lambda expression:
		// - An interfaces method implementation
		// - Specifies a parameter list followed
		//   by the body of code to execute
		//
		// Syntax: (param1, param2, param3, etc...) -> methodImplementation
		// Alternate syntax: (param1, param2, param3, etc...) -> { methodImplementation }
		// - in the first example, the lambdas implementation will return a value without the need
		//   for the return keyword
		// - the alternate syntax will require you to specify the return keyword to return a value
		
		// Instead of creating a WalkingBehaviour class, we can create an anonymous implementation
		// using a lambda expression
		Player p1 = new Player("Fred");
		
		// the lambda expression must match the method header of the interface
		// it is implementing
		// - we don't need to specify the types for the parameters, or return type of
		//   the method, as this is inferred from the interface
		MovementBehaviour walkingBehaviour = (player) -> System.out.println(player.getName() + " is moving");
		MovementBehaviour runningBehaviour = (player) -> {
			System.out.println(player.getName() + " is running.");
		}; // close the lambda's body with a semi-colon
		p1.move(walkingBehaviour);
		p1.move(runningBehaviour);
		
		// Imperative vs declarative programming
		// - Imperative: We instruct the computer line-by-line on each instruction we want it to execute
		//               to solve a given problem.
		// - Declarative: We describe what we want from the program, existing implementations will then be 
		//                performed in the background without us necessarily needing to know what implementation
		//                is used.
		
		List<String> names = List.of("Fred", "Bob", "Sarah");
		
		// imperative printing of each name in the names list
		// - we manually write the loop
		System.out.println("IMPERATIVE");
		for (var name : names) {
			System.out.println(name);
		}
		
		// declarative printing of each name
		// - we don't specify the loop, just what we want to apply to each element int he list
		System.out.println("DECLARATIVE");
		names.forEach((value) -> System.out.println(value));
		
		// Some built-in interfaces for functional programming in Java
		// - Consumer<T>
		// - Supplier<T>
		// - Predicate<T>
		// - Function<T,R>
		// where T is the type for the methods implementation and R the return type for a Function implementation
		
		// A consumer accepts a single input and returns nothing
		Consumer<String> printStringLength = (value) -> 
			System.out.println("Length of " + value + " is " + value.length());
		
		// using the consumer
		printStringLength.accept("Hello");
		// - forEach accepts a consumer of the type of the list
		names.forEach(printStringLength);
		
		// Supplier<T>
		// - returns a value of the specified type
		Supplier<MovementBehaviour> runBehaviourSupplier = () -> {
			return (player) -> {
				System.out.println(player.getName() + " is running");
			};
		};
		p1.move(runBehaviourSupplier.get());
		// Alternate way of creating the supplier:
//		Supplier<MovementBehaviour> runBehaviourSupplier = () -> 
//		(player) -> System.out.println(player.getName() + " is running");
	}

}
