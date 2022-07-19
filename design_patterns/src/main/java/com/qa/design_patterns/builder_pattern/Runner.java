package com.qa.design_patterns.builder_pattern;

import com.qa.design_patterns.builder_pattern.pizza.Cheese;
import com.qa.design_patterns.builder_pattern.pizza.Meat;
import com.qa.design_patterns.builder_pattern.pizza.Vegetable;
import com.qa.design_patterns.builder_pattern.pizza.Pizza.PizzaBuilder;

public class Runner {

	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		pizzaBuilder.name("Cheese pizza")
					.price(5.00)
					.addTopping(new Cheese("Cheddar", 0.3))
					.addTopping(new Vegetable("Sweetcorn", 0.20))
					.addTopping(new Meat("Pepperoni", 0.5));
		Item pizza = pizzaBuilder.build();
		System.out.println(pizza);
	}
}
