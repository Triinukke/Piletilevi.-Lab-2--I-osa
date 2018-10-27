package RegistrationTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Registration.Registration;

class testPasswordMatching {

	/*@Test
	void testMainPass() {
		
		Boolean passwordControll;
		Boolean ans = true;
		String password = "Malle1";
		String password2 = "Malle1";
		passwordControll = Registration.validationTwoPasswords(password2, password);
		assertEquals(ans, passwordControll);
		
	}*/

	@Test
	void testMainFail() {
		
		Boolean passwordControll;
		Boolean ans = true;
		String password = "Malle1";
		String password2 = "Malle";
		passwordControll = Registration.validationTwoPasswords(password2, password);
		assertEquals(ans, passwordControll);
		
	}

}