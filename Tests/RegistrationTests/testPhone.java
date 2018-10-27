package RegistrationTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Registration.Registration;

class testPhone {

	/*@Test
	void testMainPass() {
		Boolean phone;
		Boolean ans = true;
		String phoneValue = "5500228";
		phone = Registration.validationPhone(phoneValue);
		assertEquals(ans, phone);
	}*/

	@Test
	void testMainFail() {
		Boolean phone;
		Boolean ans = true;
		String phoneValue = "+5500228";
		phone = Registration.validationPhone(phoneValue);
		assertEquals(ans, phone);
	}
	
}
