package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.NextDate;

class NextDateTest {

	@Test
	public void testNextDate() {
		NextDate nextDate = new NextDate();

		// Test case 1: Normal case
		nextDate.setYearmonthdate(2022, 15, 3);
		assertEquals("value of day, not in the range 1...31", nextDate.next_date());

		// Test case 2: Leap year
		nextDate.setYearmonthdate(2020, 29, 2);
		assertEquals("Next Date is :1-3-2020", nextDate.next_date());

		// Test case 3: Not a leap year
		nextDate.setYearmonthdate(2021, 28, 2);
		assertEquals("Next Date is :1-3-2021", nextDate.next_date());
	}

}
