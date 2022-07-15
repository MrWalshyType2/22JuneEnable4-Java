package com.qa.todolist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import com.qa.todolist.model.Todo;
import com.qa.todolist.model.TodoList;

public class TodoListApplication {
	
	private TodoList todoList;
	private Scanner sc;

	public void run() {
		// Our todo list application starts here
		todoList = new TodoList();
		sc = new Scanner(System.in);
		boolean isRunning = true;
		
		// Setup a REPL
		// - Read, Eval, Print, Loop
		// 1. Read in an instruction from the console
		// 2. Evaluate the instruction
		// 3. Print the result to the console
		// 4. Repeat steps 1-3
		do {
			printMenu();
			
			// get input
			System.out.print("> ");
			String input = sc.nextLine();
			
			switch (input) {
			case "1":
				// get info for the new todo item
				System.out.print("Name: ");
				String todoName = sc.nextLine();
				System.out.print("Due (yyyy-mm-dd): ");
				String date = sc.nextLine();
				
				// add the todo item to the list
				Todo todo = new Todo();
				todo.setName(todoName);
				todo.setDueDate(LocalDate.parse(date));
				boolean didAdd = todoList.add(todo);
				
				// confirm if this occured or not to the user
				if (didAdd) System.out.println("New todo item added successfully");
				else System.out.println("New todo item could not be added, does it already exist?");
				break;
			case "2":
				readTodoItems();
				break;
			case "3":
				System.out.print("ID: ");
				long id = sc.nextLong();
				// bug introduced here
				// - nextLong() doesn't consume the new line character
				// - call sc.nextLine() to do it manually
				sc.nextLine();
				boolean didDelete = todoList.deleteById(id);
				
				if (didDelete) System.out.println("Delete task with ID: " + id);
				else System.out.println("Could not delete the task");
				break;
			case "4":
				isRunning = false;
				break;
			default:
				System.out.println("\nPlease enter a valid option!\n");
			}
		} while (isRunning == true);
	}

	private void readTodoItems() {
		System.out.println("\nListing todo items:");
		ArrayList<Todo> todos = todoList.read();
		
		for (Todo todoItem : todos) {
//			System.out.println("[" + todoItem.getId() + "]" + " " + todoItem.getName());
			System.out.println("[%d] %s".formatted(todoItem.getId(), todoItem.getName()));
		}
	}

	private void printMenu() {
		System.out.println("=== TodoList Application Menu ===\n");
		System.out.println("(1) Add a new todo item");
		System.out.println("(2) Read all todo items");
		System.out.println("(3) Delete a todo by its id");
		System.out.println("(4) Exit");
	}
}
