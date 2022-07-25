package com.qa.todolist_layered_architecture.controller;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.todolist_layered_architecture.domain.entity.Todo;
import com.qa.todolist_layered_architecture.domain.repository.Repository;
import com.qa.todolist_layered_architecture.utilities.InputUtilities;

@ExtendWith(value = MockitoExtension.class)
public class TodoControllerTest {

	@Mock
	private Repository<Todo, Long> todoRepository;
	
	@InjectMocks
	private TodoController controller;
	
	@Test
	public void createTest() {
		try (MockedStatic<InputUtilities> utils = Mockito.mockStatic(InputUtilities.class)) {
			Todo expected = new Todo(1, "Walk the dog", LocalDate.of(2022, 07, 25));
			Todo toSave = new Todo("Walk the dog", LocalDate.of(2022, 07, 25));
			
			Mockito.when(InputUtilities.getString("Name: ")).thenReturn(toSave.getName());
			Mockito.when(InputUtilities.getString("Date (yyyy/mm/dd): ")).thenReturn(toSave.getDueDate().toString());
			Mockito.when(todoRepository.save(toSave))
				   .thenReturn(expected);
			
			Todo actual = controller.create();
			
			Assertions.assertEquals(expected, actual);
			utils.verify(() -> InputUtilities.getString("Name: "));
			utils.verify(() -> InputUtilities.getString("Date (yyyy/mm/dd): "));
			utils.verifyNoMoreInteractions();
			Mockito.verify(todoRepository).save(toSave);
		}
	}
}
