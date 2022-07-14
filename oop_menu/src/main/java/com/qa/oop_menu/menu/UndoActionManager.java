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

	public boolean undoLastAction() {
		if (actions.size() > 0) {
			UndoableAction action = actions.pop();
			action.undo();
			return true;
		} else {
			System.out.println("No actions to undo.");
			return false;
		}
	}

}
