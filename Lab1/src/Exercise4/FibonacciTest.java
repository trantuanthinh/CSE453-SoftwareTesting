package Exercise4;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void testMainMethodExists() {
		try {
			Class<?> className = Class.forName("Fibonacci");
			Method mainMethod = className.getMethod("main", String[].class);
		} catch (ClassNotFoundException e) {
			assertTrue(false, "Class not found");
		} catch (NoSuchMethodException e) {
			assertTrue(false, "Main method not found");
		}
	}

	@Test
	void testGenerateValidInput() {
		// Testcase 1: n = 5 => result: 1 1 2 3 5
		String input1 = "5";
		ByteArrayInputStream in1 = new ByteArrayInputStream(input1.getBytes());
		System.setIn(in1);
		ByteArrayOutputStream out1 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out1));
		String[] args1 = {};
		Fibonacci.fib(Integer.parseInt(input1));
		String consoleOutput1 = "1 1 2 3 5" + System.getProperty("line.separator");
		assertEquals(consoleOutput1, out1.toString());
	}

	@Test
	void testCalculateValidInput() {
		// Testcase 2: n = 10 => result: 143
		String input2 = "10";
		ByteArrayInputStream in2 = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in2);
		ByteArrayOutputStream out2 = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out2));
		Fibonacci.fib(Integer.parseInt(input2));
		String consoleOutput2 = "143" + System.getProperty("line.separator");
		assertEquals(consoleOutput2, out2.toString());
	}
}
