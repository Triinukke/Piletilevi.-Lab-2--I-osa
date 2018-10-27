package LoginTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Login.Login;

class testNotRobot {

	/*@Test
	void testMainPass() {
		
		Boolean notRobot;
		Boolean ans = true;
		String notRobotValue = "Jah";
		notRobot = Login.controlIfNotRobot(notRobotValue);
		assertEquals(ans, notRobot);
		
	}*/
	
	@Test
	void testMainFail() {
		
		Boolean notRobot;
		Boolean ans = true;
		String notRobotValue = "Ei";
		notRobot = Login.controlIfNotRobot(notRobotValue);
		assertEquals(ans, notRobot);
		
	}

}
