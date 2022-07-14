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

	public Item create(Item item) {
		item.setId(idCounter++);
		items.add(item);
		return item;
	}

	public List<Item> getAll() {
		return items;
	}
	
	public Item getById(long id) {
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.getId() == id) {
				return item;
			}
		}
		throw new RuntimeException("Item with id " + id + " does not exist");
	}

	public boolean delete(long id) {
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);
			if (item.getId() == id) {
				return items.remove(item);
			}
		}
		return false;
	}
	
	
}
