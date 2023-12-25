package ua.edu.ucu.apps.lab12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ucu.edu.apps.task1.ATM;
import ucu.edu.apps.task1.Tray1000;
import ucu.edu.apps.task1.Tray500;

class Lab12ApplicationTests {

	@Test
	void testATM() {
		ATM atm = new ATM();
        atm.process(485);
		assertTrue(atm.firstTray instanceof Tray1000);
		assertTrue(atm.firstTray.getNext() instanceof Tray500);
	}

	@Test
	void testInvalidAmount() throws IllegalArgumentException {
		ATM atm = new ATM();
		try {
			atm.process(488);
		} catch (IllegalArgumentException e) {
			assertEquals("Unable to collect this amount.", e.getMessage());
		}
	}

}
