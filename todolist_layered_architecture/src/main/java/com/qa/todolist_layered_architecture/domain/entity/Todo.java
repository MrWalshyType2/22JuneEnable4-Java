package com.qa.todolist_layered_architecture.domain.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Todo {

	// 3 fields - instance variables
	// - each instance (object) of type Todo will have these 3 fields, with their own unique values
	private long id;
	private String name;
	private LocalDate dueDate;
	
	public Todo(String name, LocalDate dueDate) {
		super();
		this.name = name;
		this.dueDate = dueDate;
	}
	
	public Todo(long id, String name, LocalDate dueDate) {
		super();
		this.name = name;
		this.dueDate = dueDate;
		this.id = id;
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
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", dueDate=" + dueDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dueDate, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(dueDate, other.dueDate) && id == other.id && Objects.equals(name, other.name);
	}
	
}
