
package SearchTests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Registration.Registration;
import SearchEvent.Search;

class testingSearch {

	/*@Test
	void testMainPass() {	
		Boolean userInput;
		Boolean ans = true;
		String insertedValue = "ED".toUpperCase();
		String[] events = { "SIMPLE SESSION 19, SIMPLE SESSION 2019, SAKU SUURHALL",
				"VALGUSE OOTEL, HEDVIG HANSON JA UKU SUVISTE, PÄRNU KULTUURIMAJA",
				"STAND-UP COMEDY, COMEDY ESTONIA, PÖÖNING" };
		userInput = Search.checkIfEventExists(insertedValue, events);
		assertEquals(ans, userInput);
	}*/
	
	@Test
	void testMainFail() {	
		Boolean userInput;
		Boolean ans = true;
		String insertedValue = "sssss".toUpperCase();
		String[] events = { "SIMPLE SESSION 19, SIMPLE SESSION 2019, SAKU SUURHALL",
				"VALGUSE OOTEL, HEDVIG HANSON JA UKU SUVISTE, PÄRNU KULTUURIMAJA",
				"STAND-UP COMEDY, COMEDY ESTONIA, PÖÖNING" };
		userInput = Search.checkIfEventExists(insertedValue, events);
		assertEquals(ans, userInput);
	}

}
