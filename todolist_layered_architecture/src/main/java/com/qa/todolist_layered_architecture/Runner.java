package com.qa.todolist_layered_architecture;

import com.qa.todolist_layered_architecture.controller.TodoController;
import com.qa.todolist_layered_architecture.domain.repository.TodoRepository;

public class Runner {

	public static void main(String[] args) {
		TodoController todoController = new TodoController(new TodoRepository());
		TodoListApp tdl = new TodoListApp(todoController);
		tdl.run();
	}

}
