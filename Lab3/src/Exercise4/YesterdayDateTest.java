package Exercise4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Exercise3.Client_Product;

class YesterdayDateTest {

	@DisplayName("Test")
	@ParameterizedTest(name = "year={0}, date={1}, month={2}, expectedResult={3}")
	@CsvSource({ 
		"2026,1,1,'value of year, not in the range 1800.......2025'",
		"1913,32,1,'Value of day, not in the range 1...31'",
		"1913,1,32,'value of month, not in the range 1....12",
		"2020,31,4,'value of day, not in the range day<=30'",
		"2021,29,2,'invalid date input for not a leap year'",
		"2020,29,2,'Previous Date is :28-2-2020'",
		"2020,1,3,'Previous Date is :29-2-2020'",
		"2021,1,3,'Previous Date is :28-2-2020'",
		"1913,1,1,'Previous Date is :31-12-1912'",
		"1913,1,17,'Previous Date is :16-1-1913'",
		"1913,11,5,'Previous Date is :4-11-1913'",
	})
	void testNormal(int year, int date, int month, String expectedResult) {
		YesterdayDate yesterdayDate = new YesterdayDate();
		yesterdayDate.setYearmonthdate(year, date, month);
		String result = yesterdayDate.yesterday_date();
		assertEquals(expectedResult, result);
	}
}
