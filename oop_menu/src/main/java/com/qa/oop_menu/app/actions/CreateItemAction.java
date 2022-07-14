package com.qa.oop_menu.app.actions;

import java.util.ArrayList;
import java.util.List;

import com.qa.oop_menu.InputUtilities;
import com.qa.oop_menu.app.controller.ItemController;
import com.qa.oop_menu.app.domain.Item;
import com.qa.oop_menu.menu.UndoableAction;

public class CreateItemAction implements UndoableAction {

	private ItemController itemController;
	private Item created;

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
		created = itemController.create(new Item(name, description, quantity));
	}

	@Override
	public void undo() {
		if (created == null) {
			throw new NullPointerException("Nothing to undo");
		}
		itemController.delete(created.getId());
	}
}
