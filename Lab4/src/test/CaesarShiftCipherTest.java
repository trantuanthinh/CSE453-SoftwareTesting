package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CaesarShiftCipher;

class CaesarShiftCipherTest {

	@Test
	public void testCaesarShift() {
		CaesarShiftCipher cipher = new CaesarShiftCipher();

		// Test case 1: Shift within the alphabet
		assertEquals("EXXEGOEXSRGI", cipher.CaesarShift("ATTACKATONCE", 4));

		// Test case 2: Shift exceeds the alphabet length
		assertEquals("EXXEGOEXSRGI", cipher.CaesarShift("ATTACKATONCE", 30));

		// Test case 3: Shift is negative
		assertEquals("EXXEGOEXSRGI", cipher.CaesarShift("ATTACKATONCE", -22));

		// Test case 4: Invalid character in the message
		assertEquals("invalid", cipher.CaesarShift("ATTACK123", 4));
	}
}
