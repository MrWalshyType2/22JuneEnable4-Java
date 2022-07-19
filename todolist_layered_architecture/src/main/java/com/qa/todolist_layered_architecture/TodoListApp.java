package com.qa.todolist_layered_architecture;

import com.qa.todolist_layered_architecture.controller.TodoController;
import com.qa.todolist_layered_architecture.domain.repository.TodoRepository;
import com.qa.todolist_layered_architecture.utilities.InputUtilities;

public class TodoListApp {
	
	private TodoController todoController;
	private boolean isRunning = true;
	
	public TodoListApp(TodoController todoController) {
		this.todoController = todoController;
		// this.todoController = new TodoController(new TodoRepository());
		// The dependency inversion principle of SOLID states that an object
		// should not be responsible for creating its own dependencies, these should
		// be passed in from an external source.
		// - this reduces coupling, the TodoListApp is no longer tied to a specific
		//   class, instead we could use any TodoController or subclass now
	}

	public void run() {
		do {
			// Exception handling
			// - exceptions will crash the program
			// - all exceptions inherit from the class Exception
			// - there are two types of exception, checked and unchecked
			// - unchecked are runtime exceptions like NullPointerException
			//   or IllegalArgumentException, these do not need to be handled
			//   but will crash the program if not handled
			// - checked exceptions must be handled
			
			// We can throw exceptions with: throw new Exception("Message");
			
			// The try {} block is the code we want to run that might throw
			// an exception, i.e., which might crash the program
			try {
				printMenu();
				
				// get input
				String input = InputUtilities.getString("> ");
				TodoMenuOption option = getInputOption(input);
				
				switch (option) {
				case CREATE:
					todoController.create();
					break;
				case READ:
					todoController.read();
					break;
				case UPDATE:
					break;
				case DELETE_BY_ID:
					break;
				case DELETE_BY_NAME:
					break;
				case EXIT:
					isRunning = false;
					break;
				}
			} catch (IllegalArgumentException e) {
				// the catch () {} block is the code that runs if an exception occurs
				System.out.println("Error: " + e.getMessage());
			} catch (Exception e) {
				// can have multiple catch blocks, from most specific to least specific
				System.out.println("Something went wrong...");
			}
		} while (isRunning == true);
	}

	private TodoMenuOption getInputOption(String input) {
		TodoMenuOption[] menuOptions = TodoMenuOption.values();
		
		for (int i = 0; i < menuOptions.length; i++) {
			if (menuOptions[i].getInputCode().equalsIgnoreCase(input)) {
				return menuOptions[i];
			}
		}
		throw new IllegalArgumentException("Invalid menu option");
	}

	private void printMenu() {
		TodoMenuOption[] menuOptions = TodoMenuOption.values();
		
		for (int i = 0; i < menuOptions.length; i++) {
			String output = String.format("[%s] %s", menuOptions[i].getInputCode(), menuOptions[i].toString());
			System.out.println(output);
		}
	}
}
