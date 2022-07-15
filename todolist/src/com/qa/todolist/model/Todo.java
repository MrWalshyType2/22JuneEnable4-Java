package com.qa.todolist.model;

import java.time.LocalDate;

public class Todo {

	// 3 fields - instance variables
	// - each instance (object) of type Todo will have these 3 fields, with their own unique values
	private long id;
	private String name;
	private LocalDate dueDate;
	
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
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
