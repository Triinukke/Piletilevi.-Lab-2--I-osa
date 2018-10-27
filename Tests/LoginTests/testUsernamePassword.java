package LoginTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Login.Login;
import Login.Users;
import Registration.Registration;

class testUsernamePassword {

	/*@Test
	void testMainPass() {
		
		Boolean usernamePasswordCorrect;
		Boolean ans = true;
		String[][] accounts = {{"TestTest", "TestTest1"},{"TereTere", "TereTere2"},{"Detsember", "Detsember3"}};
		String username = "Detsember";
		String password = "Detsember3";
		
		Users check = new Users(username, password);
		check.accounts = accounts;
		boolean a = check.auth();
		assertEquals(ans, a);
		
		check.auth();
		
	}*/
	
	@Test
	void testMainFail() {
		
		Boolean usernamePasswordCorrect;
		Boolean ans = true;
		String[][] accounts = {{"TestTest", "TestTest1"},{"TereTere", "TereTere2"},{"Detsember", "Detsember3"}};
		String username = "Detsember";
		String password = "Detsember";
		
		Users check = new Users(username, password);
		check.accounts = accounts;
		boolean a = check.auth();
		assertEquals(ans, a);
		
		check.auth();
		
	}

}
