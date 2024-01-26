package Exercise2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Exercise1.TriangleClassify;

class CommissioningProblemTest {

	@DisplayName("Normal Boundary Value Test")
	@ParameterizedTest(name = "locks={0}, stocks={1}, barrels={2}, expectedResult={3}")
	@CsvSource({ "35,40,45, 640.0", "35,40,1, 420.0", "35,40,2, 425.0", "35,40,89, 860.0", "35,40,90, 865.0",
			"35,1,45, 406.0", "35,2,45, 412.0", "35,79,45, 874.0", "35,80,45, 880.0", "1,40,45, 334.0",
			"2,40,45, 343.0", "69,40,45, 946.0", "70,40,45, 955.0", })
	void testNormal(int locks, int stocks, int barrels, String expectedResult) {
		CommissioningProblem commission = new CommissioningProblem();
		commission.setInput(locks, stocks, barrels);
		double sales = commission.calSale();
		double result = commission.calCommission(sales);
		assertEquals(expectedResult, String.valueOf(result));
	}

	@DisplayName("Robustness Boundary Value Test")
	@ParameterizedTest(name = "locks={0}, stocks={1}, barrels={2}, expectedResult={3}")
	@CsvSource({ "35,40,45, 640.0", "35,40,0, 0.0", "35,40,1, 420.0", "35,40,2, 425.0", "35,40,89, 860.0",
			"35,40,90, 865.0", "35,40,91, 0.0", "35,0,45, 0.0", "35,1,45, 406.0", "35,2,45, 412.0", "35,79,45, 874.0",
			"35,80,45, 880.0", "35,81,45, 0.0", "0,40,45, 0.0", "1,40,45, 334.0", "2,40,45, 343.0", "69,40,45, 946.0",
			"70,40,45, 955.0", "71,40,45, 0.0", })
	void testRobust(int locks, int stocks, int barrels, String expectedResult) {
		CommissioningProblem commission = new CommissioningProblem();
		commission.setInput(locks, stocks, barrels);
		double sales = commission.calSale();
		double result = commission.calCommission(sales);
		assertEquals(expectedResult, String.valueOf(result));
	}

}
