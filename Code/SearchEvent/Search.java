package SearchEvent;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Otsing: ");
		String userInput;
		userInput = input.next().toUpperCase(); // Converting input to upper case.
		String[] events = { "SIMPLE SESSION 19, SIMPLE SESSION 2019, SAKU SUURHALL",
				"VALGUSE OOTEL, HEDVIG HANSON JA UKU SUVISTE, PÄRNU KULTUURIMAJA",
				"STAND-UP COMEDY, COMEDY ESTONIA, PÖÖNING" };

		if (checkIfEventExists(userInput, events)) {
			System.out.println("Head elamust!");
		} else {
			System.out.println("Sinu otsing ei andnud tulemust!");
		}
	}

	public static boolean checkIfEventExists(String userInput, String[] events) {
		boolean found = false;
		for (int i = 0; i <= events.length - 1; i++) {
			if (events[i].contains(userInput)) {
				System.out.println("Oi, sinu küsitud üritus " + events[i] + " on olemas!");
				found = true;
			}
		}
		return found;
	}
}