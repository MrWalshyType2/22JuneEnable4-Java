package com.qa.generics.bounded_generics;

public class Runner {

	public static void main(String[] args) {
		// Generic types can be bound to an upper or lower bound
		// Upper bound:
		// - states that T must be of the upper bounds type
		//   or a subclass of the upper bound
		// - represented as class ClassName<T extends Type>
		// Lower bound:
		// - states that T must be of the lower bounds type or
		//   a supertype of the lower bound
		// - represented as class ClassName<T super Type>
		ItemBox itemBox = new ItemBox(new Item());
		GenericBox<Item> genericItemBox = itemBox;
		Item item = genericItemBox.get();
		System.out.println(item);
	}
}
