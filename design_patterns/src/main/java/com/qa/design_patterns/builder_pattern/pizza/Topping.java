package com.qa.design_patterns.builder_pattern.pizza;

import com.qa.design_patterns.builder_pattern.Item;

public abstract class Topping extends Item {
	
	public final static double BASE = 0.2;
	
	public Topping(String name, double price) {
		super(name, BASE + price);
	}

	@Override
	public String toString() {
		return "Topping [name=" + getName() + ", topping price=£" + getPrice() + "]";
	}

}
