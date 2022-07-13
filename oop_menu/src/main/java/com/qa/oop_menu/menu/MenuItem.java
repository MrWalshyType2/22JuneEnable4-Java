package com.qa.oop_menu.menu;

public class MenuItem implements Action {

	private String name;
	private String userInputCode;
	private Action action;

	public MenuItem(String name, String userInputCode, Action action) {
		this.name = name;
		this.userInputCode = userInputCode;
		this.action = action;
	}
	
	@Override
	public void execute() {
		this.action.execute();	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserInputCode() {
		return userInputCode;
	}

	public void setUserInputCode(String userInputCode) {
		this.userInputCode = userInputCode;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
	
}
