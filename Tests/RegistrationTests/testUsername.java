package RegistrationTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Registration.Registration;

class testUsername {

	@Test
	void testMainPass() {
		
		Boolean username;
		Boolean ans = true;
		String insertedValue = "Test";
		username = Registration.validationUsername(insertedValue);
		assertEquals(ans, username);
	
	}

	/*@Test
	void testMainFail() {
		
		Boolean username;
		Boolean ans = true;
		String insertedValue = "";
		username = Registration.validationUsername(insertedValue);
		assertEquals(ans, username);
	
	}*/
}
