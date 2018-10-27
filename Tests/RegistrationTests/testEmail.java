package RegistrationTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import Registration.Registration;

import org.junit.jupiter.api.Test;

class testEmail {

	/*@Test
	void testMainPass() {
		Boolean email;
		Boolean ans = true;
		String aadress = "test@hot.ee";
		email = Registration.validationEmail(aadress);
		assertEquals(ans, email);
	}*/
	
	@Test
	void testMainFail() {
		Boolean email;
		Boolean ans = true;
		String aadress = "test@.ee";
		email = Registration.validationEmail(aadress);
		assertEquals(ans, email);
	}

}
