package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.TwoNumbersSum;

class TwoNumbersSumTest {

	@Test
	public void testAddTwoNumbers() {
		TwoNumbersSum calculator = new TwoNumbersSum();

		// Test case 1: Adding two numbers without carry
		ArrayList<Integer> result1 = calculator.addTwoNumbers(new ArrayList<>(Arrays.asList(1, 2, 3)),
				new ArrayList<>(Arrays.asList(4, 5, 6)));
		assertEquals(Arrays.asList(5, 7, 9), result1);

		// Test case 2: Adding two numbers with carry
		ArrayList<Integer> result2 = calculator.addTwoNumbers(new ArrayList<>(Arrays.asList(9, 9, 9)),
				new ArrayList<>(Arrays.asList(1)));
		assertEquals(Arrays.asList(1, 0, 0, 0), result2);

		// Test case 3: Adding two empty lists
		ArrayList<Integer> result3 = calculator.addTwoNumbers(new ArrayList<>(), new ArrayList<>());
		assertEquals(new ArrayList<>(), result3);
	}
}
