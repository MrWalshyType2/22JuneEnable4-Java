package com.qa.oop_menu.app.controller;

import java.util.ArrayList;
import java.util.List;

import com.qa.oop_menu.app.domain.Item;

public class ItemController {

	private long idCounter = 1;
	private List<Item> items;
	
	public ItemController() {
		this.items = new ArrayList<>();
	}

	public void create(Item item) {
		item.setId(idCounter++);
		items.add(item);
	}

	public List<Item> getAll() {
		return items;
	}
	
	
}
