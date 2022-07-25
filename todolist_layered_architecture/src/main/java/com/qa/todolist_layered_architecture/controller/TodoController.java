package com.qa.todolist_layered_architecture.controller;

import java.time.LocalDate;
import java.util.List;

import com.qa.todolist_layered_architecture.domain.entity.Todo;
import com.qa.todolist_layered_architecture.domain.repository.Repository;
import com.qa.todolist_layered_architecture.domain.repository.TodoRepository;
import com.qa.todolist_layered_architecture.utilities.InputUtilities;

public class TodoController {

	private Repository<Todo, Long> todoRepository;
	
	public TodoController(Repository<Todo, Long> todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public Todo create() {
		String name = InputUtilities.getString("Name: ");
		String date = InputUtilities.getString("Date (yyyy/mm/dd): ");
		
		Todo todo = todoRepository.save(new Todo(name, LocalDate.parse(date)));
		System.out.println("Todo created successfully!\n\t" + todo.toString() + "\n");
		return todo;
	}
	
	public List<Todo> read() {
		List<Todo> todos = todoRepository.read();
		for (Todo todo : todos) {
			System.out.println(todo.toString());
		}
		return todos;
	}
	
	public Todo update() {
		return null;
	}
	
	public boolean deleteById() {
		return false;
	}
	
	public boolean deleteByName() {
		return false;
	}
}
