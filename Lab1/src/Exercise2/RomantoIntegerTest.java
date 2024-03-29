package Exercise2;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RomantoIntegerTest {

	@Test
	@DisplayName("With Valid Input, Should Have Positive Output")
	void testConvertWithValidInput() {
		String input = "X";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		RomantoInteger.main(args);
		String consoleOutput = "10" + System.getProperty("line.separator");
		assertEquals(consoleOutput, out.toString());
	}

	@Test
	@DisplayName("Should Not Have More Than 3 Same Roman Number, -1 If Wrong")
	void testMoreThanThreeRomanNumeralTogether() {
		String input = "IIII";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		RomantoInteger.main(args);
		String consoleOutput = "-1" + System.getProperty("line.separator");
		assertEquals(consoleOutput, out.toString());
	}

	@Test
	@DisplayName("Add To The Numberal Before It, If It Is Smaller Than The Previous One")
	void testAddedNumberWithLarger_Smaller() {
		String input = "XVI";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		RomantoInteger.main(args);
		String consoleOutput = "16" + System.getProperty("line.separator");
		assertEquals(consoleOutput, out.toString());
	}

	@Test
	@DisplayName("Add To The Numberal Before It, If It Is Equal The Previous One")
	void testAddedNumberWithEqual() {
		String input = "XX";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		RomantoInteger.main(args);
		String consoleOutput = "20" + System.getProperty("line.separator");
		assertEquals(consoleOutput, out.toString());
	}

	@Test
	@DisplayName("Substract To The Numberal Before It")
	void testSubstraction() {
		String input = "LIX";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		RomantoInteger.main(args);
		String consoleOutput = "59" + System.getProperty("line.separator");
		assertEquals(consoleOutput, out.toString());
	}

	@Test
	@DisplayName("Should Not Substract To The Numberal More Than Once Before It")
	void testValidSubstraction() {
		String input = "XIIX";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		RomantoInteger.main(args);
		String consoleOutput = "-1" + System.getProperty("line.separator");
		assertEquals(consoleOutput, out.toString());
	}
}
