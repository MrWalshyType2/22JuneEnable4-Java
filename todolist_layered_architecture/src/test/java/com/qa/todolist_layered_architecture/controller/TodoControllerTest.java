package com.qa.todolist_layered_architecture.controller;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.todolist_layered_architecture.domain.entity.Todo;
import com.qa.todolist_layered_architecture.domain.repository.Repository;
import com.qa.todolist_layered_architecture.utilities.InputUtilities;

// @ExtendWith is a JUnit 5 annotation for extending the behaviour
// of the JUnit runner
// - MockitoExtension is the Mockito JUnit runner extension
@ExtendWith(value = MockitoExtension.class)
public class TodoControllerTest {
	
	// In a Unit test, we don't care about the dependencies of a method
	// - we only care what the method under test is doing
	// - we mock (fake) the dependencies and specify what we would like returned

	@Mock // annotate the variable with @Mock to indicate it is a mocked/fake object
	private Repository<Todo, Long> todoRepository;
	// - by mocked, we mean it has no implementation but we can still use it in the
	//   tests by specifying what we want returned from its methods
	
	// this will inject the required dependencies into the field on TodoController
	// - our mock dependencies
	@InjectMocks
	private TodoController controller;
	
	// External behaviours of TodoController.create():
	// - InputUtilities.getString()
	// - todoRepository.save()
	@Test
	public void createTest() {
		// MockedStatic is coming from the mockito-inline dependency
		// - allows to test static method calls
		// - Mockito.mockStatic accepts the class whose static methods we want to mock
		try (MockedStatic<InputUtilities> utils = Mockito.mockStatic(InputUtilities.class)) {
			// prepare my test data
			Todo expected = new Todo(1, "Walk the dog", LocalDate.of(2022, 07, 25));
			Todo toSave = new Todo("Walk the dog", LocalDate.of(2022, 07, 25));
			Todo toReturn = new Todo(1, "Walk the dog", LocalDate.of(2022, 07, 25));
			
			// specify what the mocked objects methods (or static methods) should return
			// - Mockito.when(SomeMockedObject.methodCall()).thenReturn(value);
			Mockito.when(InputUtilities.getString("Name: ")).thenReturn(toSave.getName());
			Mockito.when(InputUtilities.getString("Date (yyyy/mm/dd): ")).thenReturn(toSave.getDueDate().toString());
			Mockito.when(todoRepository.save(toSave))
				   .thenReturn(toReturn);
			
			// perform the action of the test
			Todo actual = controller.create();
			
			// assert the result was as expected and verify the mocked objects methods
			// where actually called
			Assertions.assertEquals(expected, actual);
			utils.verify(() -> InputUtilities.getString("Name: ")); // verifying a static method
			utils.verify(() -> InputUtilities.getString("Date (yyyy/mm/dd): "));
			utils.verifyNoMoreInteractions();
			Mockito.verify(todoRepository).save(toSave); // verifying the save method
			// on the mocked repository object was called with the expected data
		}
	}
}
