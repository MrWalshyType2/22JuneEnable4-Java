package com.qa.oop_menu.menu;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndoActionManager {
	
	private Deque<UndoableAction> actions;
	
	public UndoActionManager() {
		this.actions = new ArrayDeque<>();
	}

	public void push(UndoableAction action) {
		actions.push(action);
	}

	public void undoLastAction() {
		UndoableAction action = actions.pop();
		
		if (!action.undo()) actions.push(action);
	}

}
