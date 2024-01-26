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
	@ParameterizedTest(name = "gender={0}, city_dwellers={1}, age={2}, expectedResult={3}")
	@CsvSource({ 
		""
		, })
	void testNormal(String gender, String city_dwellers, int age, String expectedResult) {
		Client_Product client = new Client_Product();
		client.setInput(gender, city_dwellers, age);
		String product = client.assignProduct();
		assertEquals(expectedResult, String.valueOf(product));
	}
}
