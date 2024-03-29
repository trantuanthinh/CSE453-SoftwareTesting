package Exercise3;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TriangleTest {

	 @Test
	    public void testMainMethodExists() {
	        try {
	            Class<?> className = Class.forName("Triangle");
	            Method mainMethod = className.getMethod("main", String[].class);
	        } catch (ClassNotFoundException e) {
	            assertTrue(false, "Class not found");
	        } catch (NoSuchMethodException e) {
	            assertTrue(false, "Main method not found");
	        }
	    }

	@Test
	@DisplayName("Test Triangle With Valid Number")
	void testValidNumber() {
		// Test case 1: 3 4 5 => true
		String input1 = "3" + System.lineSeparator() + "4" + System.lineSeparator() + "5";
		ByteArrayInputStream in1 = new ByteArrayInputStream(input1.getBytes());
		System.setIn(in1);
		ByteArrayOutputStream out1 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out1));
		String[] args1 = {};
		Triangle.main(args1);
		String consoleOutput1 = "Enter side 1: " + System.lineSeparator();
		consoleOutput1 += "Enter side 2: " + System.lineSeparator();
		consoleOutput1 += "Enter side 3: " + System.lineSeparator();
		consoleOutput1 += "This is a triangle.";
		assertEquals(consoleOutput1, out1.toString());

		// Test case 2: 1 2 3 => false
		String input2 = "1" + System.lineSeparator() + "2" + System.lineSeparator() + "3";
		ByteArrayInputStream in2 = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in2);
		ByteArrayOutputStream out2 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out2));
		String[] args2 = {};
		Triangle.main(args2);
		String consoleOutput2 = "Enter side 1: " + System.lineSeparator();
		consoleOutput2 += "Enter side 2: " + System.lineSeparator();
		consoleOutput2 += "Enter side 3: " + System.lineSeparator();
		consoleOutput2 += "This is not a triangle.";
		assertEquals(consoleOutput2, out2.toString());
	}

}
