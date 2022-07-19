package com.qa.todolist_layered_architecture;

public enum TodoMenuOption {

	CREATE("C"), 
	READ("R"), 
	UPDATE("U"), 
	DELETE_BY_ID("D"), 
	DELETE_BY_NAME("DN"), 
	EXIT("E");
	
	private String inputCode;
	
	private TodoMenuOption(String inputCode) {
		this.inputCode = inputCode;
	}
	
	public String getInputCode() {
		return this.inputCode;
	}
}
