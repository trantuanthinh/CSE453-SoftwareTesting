package Exercise1;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import org.junit.jupiter.api.Test;

class CircleRadiusTest {

	@Test
	void testValidInput() {
		String input = "1\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		CircleRadius.main(args);

		String consoleOutput = "Enter the radius " + System.getProperty("line.separator");
		consoleOutput += "For a circle with radius 1.0," + System.getProperty("line.separator");
		consoleOutput += "The circumference is 6.283185307179586" + System.getProperty("line.separator");
		consoleOutput += "and the area is 3.141592653589793." + System.getProperty("line.separator");
		assertEquals(consoleOutput, out.toString());
	}

	@Test
	void testCharacter() {
		String input = "abc\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		CircleRadius.main(args);
		assertThrows(InputMismatchException.class, () -> {
			CircleRadius.main(args);
		});
	}
	
	@Test
	void testNegative() {
		String input = "-5\n";
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		String[] args = {};
		CircleRadius.main(args);
		String consoleOutput = "Enter the radius " + System.getProperty("line.separator");
		consoleOutput += "You have entered wrong value." + System.getProperty("line.separator");
	}
}
