package com.qa.todolist;

public class Runner {

	public static void main(String[] args) {
		// Usually, the main method will start our system using an instance of another class
		TodoListApplication todoListApp = new TodoListApplication();
		todoListApp.run();
	}
}
