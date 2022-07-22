package com.qa.generics.bounded_generics;

// this box will only work with an Item object or an object of
// a subclass of Item
public class ItemBox extends GenericBox<Item> {

	public ItemBox(Item value) {
		super(value);
	}

}