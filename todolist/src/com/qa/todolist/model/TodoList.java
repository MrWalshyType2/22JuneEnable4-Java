package com.qa.todolist.model;

import java.util.ArrayList;

public class TodoList {

	private long idCounter = 1;
	private ArrayList<Todo> todoItems = new ArrayList<>();
	// As Todo is in the same package, we don't need to import it
	
	// ids and name must be unique
	public boolean add(Todo todo) {		
		for (int i = 0; i < todoItems.size(); i++) {
			Todo current = todoItems.get(i); // get the current todo item in todoItems
			
			if (todo.getId() == current.getId()) {
				// Rule of thumb for equality: Only use == for primitive types, and the .equals() method for all reference types
				return false;
			} else if (todo.getName().equals(current.getName())) {
				// All reference types have a .equals() method on them
				// - this should be used for comparing them
				// - == compares the value in the variable, which with reference types is the reference rather than the object itself
				return false;
			}
		}
		// if we get all the way through the loop, the Todo mustn't exist
		todo.setId(idCounter++);
		todoItems.add(todo);
		return true;
	}
	
	public boolean deleteById(long id) {
		boolean didDelete = false;
		
		for (int i = 0; i < todoItems.size(); i++) {
			Todo current = todoItems.get(i);
			
			if (current.getId() == id) {
				didDelete = todoItems.remove(current);
				break;
			}
		}
		
		return didDelete;
	}

	public ArrayList<Todo> read() {
		return todoItems;
	}
}
