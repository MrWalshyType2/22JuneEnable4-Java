package com.qa.oop_menu.app.actions;

import com.qa.oop_menu.InputUtilities;
import com.qa.oop_menu.app.controller.ItemController;
import com.qa.oop_menu.app.domain.Item;
import com.qa.oop_menu.menu.Action;

public class CreateItemAction implements Action {

	protected ItemController itemController;

	public CreateItemAction(ItemController itemController) {
		super();
		this.itemController = itemController;
	}

	@Override
	public void execute() {
		String name = InputUtilities.getString("NAME: ");
		String description = InputUtilities.getString("DESCRIPTION: ");
		int quantity = InputUtilities.getInt("QUANTITY: ");
		InputUtilities.getString(""); // consume the rest of the line otherwise it causes bugs when nextLine() is next called
		itemController.create(new Item(name, description, quantity));
	}

}
