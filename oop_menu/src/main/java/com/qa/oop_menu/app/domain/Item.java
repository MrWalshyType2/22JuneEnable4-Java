package com.qa.oop_menu.app.domain;

public class Item {

	private long id;
	private String name;
	private String description;
	private int quantity;

	public Item(String name, String description, int quantity) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
