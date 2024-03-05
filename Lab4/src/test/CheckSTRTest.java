package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CheckSTR;

class CheckSTRTest {

	@Test
	public void testConvert() {
		CheckSTR checkSTR = new CheckSTR();

		// Test case 1: Empty string
		assertEquals("", checkSTR.convert(""));

		// Test case 2: Single character
		assertEquals("1001001", checkSTR.convert("I")); // ASCII value of 'I' is 73

		// Test case 3: Multiple characters
		assertEquals("100100111001101110110", checkSTR.convert("I Love"));
	}

	@Test
	public void testTotal() {
		CheckSTR checkSTR = new CheckSTR();

		// Test case 1: Empty string
		assertEquals(0, checkSTR.total(""));

		// Test case 2: Single character
		assertEquals(73, checkSTR.total("I"));

		// Test case 3: Multiple characters
		assertEquals(432, checkSTR.total("Hello"));

	}

	@Test
	public void testBinarise() {
		CheckSTR checkSTR = new CheckSTR();

		// Test case 1: 0
		assertEquals("", checkSTR.binarise(0));

		// Test case 2: Positive number
		assertEquals("1001", checkSTR.binarise(9));

		// Test case 3: Large number
		assertEquals("1101111101001001101100", checkSTR.binarise(987654));
	}

}
