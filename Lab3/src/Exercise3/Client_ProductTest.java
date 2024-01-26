package Exercise3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import Exercise2.CommissioningProblem;

class Client_ProductTest {

	@DisplayName("Test")
	@ParameterizedTest(name = "gender={0}, city_dwellers={1}, age={2}, expectedResult={3}")
	@CsvSource({ "Female,Yes,34,W X and Y", "Female,No,34,W and X", "Male,Yes,34,Only X", "Male,No,34,Only X",
			"Female,Yes,40,X and Y", "Female,No,40,Only X", "Male,Yes,40,Only X", "Male,No,40,X and Z",
			"Female,Yes,66,Only Y", "Female,No,66,No Product", "Male,Yes,66,Only X", "Male,No,66,Only X",
	})
	void testNormal(String gender, String city_dwellers, int age, String expectedResult) {
		Client_Product client = new Client_Product();
		client.setInput(gender, city_dwellers, age);
		String product = client.assignProduct();
		assertEquals(expectedResult, String.valueOf(product));
	}
}
