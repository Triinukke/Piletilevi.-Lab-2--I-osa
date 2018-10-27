package RegistrationTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Registration.Registration;

class testPassword {

	/*@Test
	void testMainPass() {
		Boolean password;
		Boolean ans = true;
		String passwordValue = "Malle1";
		password = Registration.validationPassword(passwordValue);
		assertEquals(ans, password);
	}*/
	
	@Test
	void testMainFail() {
		Boolean password;
		Boolean ans = true;
		String passwordValue = "Malle";
		password = Registration.validationPassword(passwordValue);
		assertEquals(ans, password);
	}

}
