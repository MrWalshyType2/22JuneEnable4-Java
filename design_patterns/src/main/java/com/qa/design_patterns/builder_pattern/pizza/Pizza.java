package com.qa.design_patterns.builder_pattern.pizza;

import java.util.ArrayList;
import java.util.List;

import com.qa.design_patterns.builder_pattern.Item;

public class Pizza extends Item {
	
	private final List<Topping> pizzaToppings;

	public Pizza(String name, double price, List<Topping> pizzaToppings) {
		super(name, price);
		if (pizzaToppings == null) throw new NullPointerException("mealItems cannot be null");
		this.pizzaToppings = pizzaToppings;
	}
	
	@Override
	public double getPrice() {
		double sumOfToppings = 0.0;
		for (var topping : pizzaToppings) {
			sumOfToppings += topping.getPrice();
		}
		return super.getPrice() + sumOfToppings;
	}

	@Override
	public String toString() {
		return "Pizza [pizzaToppings=" + pizzaToppings + ", total price=£" + getPrice() + ", name=" + getName()
				+ "]";
	}

	public static class PizzaBuilder {
		
		private String name;
		private double price;
		private List<Topping> toppings;
		
		public PizzaBuilder() {
			this.price = 0.0;
			this.toppings = new ArrayList<>();
		}
		
		public PizzaBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public PizzaBuilder price(double price) {
			this.price = price;
			return this;
		}
		
		public PizzaBuilder addTopping(Topping topping) {
			this.toppings.add(topping);
			return this;
		}
		
		public Pizza build() {
			return new Pizza(name, price, toppings);
		}
	}
}
