package org.morehouse.restapp.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UpdateTodoTest {
	
	@Test
	public void testChangeAssignee() {
		// setup
		TodosResource resource = new TodosResource();
		Todo existing = new Todo();
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee("someone else");
		
		// execute
		boolean isValid = resource.validateUpdate(existing, update);
		
		// validate
		assertTrue(isValid);
	}
	
	@Test
	public void testRemoveAssignee() {
		Todo existing = new Todo();
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee(null);
		
		// execute
		boolean isValid = TodosResource.validateUpdate(existing, update);
				
		//validate
		assertFalse(isValid);
	
	}

}
