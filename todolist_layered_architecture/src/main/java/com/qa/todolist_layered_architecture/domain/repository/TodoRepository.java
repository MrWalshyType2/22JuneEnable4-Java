package com.qa.todolist_layered_architecture.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.qa.todolist_layered_architecture.domain.entity.Todo;

public class TodoRepository {

	// emulate db interaction
	private List<Todo> todoItems;
	private long idCounter;

	public TodoRepository() {
		this.todoItems = new ArrayList<>();
		idCounter = 1;
	}

	public Todo save(Todo todo) {
		for (int i = 0; i < todoItems.size(); i++) {
			Todo current = todoItems.get(i); // get the current todo item in todoItems

			if (todo.getName().equals(current.getName())) {
				throw new RuntimeException("Todo already exists with given name");
			}
		}
		// if we get all the way through the loop, the Todo mustn't exist
		todo.setId(idCounter++);
		todoItems.add(todo);
		return todo;
	}

	public List<Todo> read() {
		return todoItems;
	}

	public Todo update(Todo todo) {
		return null;
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

	public boolean deleteByName(String name) {
		return false;
	}
}
