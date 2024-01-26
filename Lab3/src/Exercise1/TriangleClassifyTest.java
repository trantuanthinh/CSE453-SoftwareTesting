package Exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleClassifyTest {

	@DisplayName("Normal Boundary Value Test")
	@ParameterizedTest(name = "side1={0}, side2={1}, side3={2}, expectedResult={3}")
	@CsvSource({ "100, 100, 100, EQUILATERAL", "100, 100, 1, ISOSCELES", "100, 100, 2, ISOSCELES",
			"100, 100, 199, ISOSCELES", "100, 100, 200, IsNotTriangle", "100, 1, 100, ISOSCELES",
			"100, 2, 100, ISOSCELES", "100, 199, 100, ISOSCELES", "100, 200, 100, IsNotTriangle",
			"1, 100, 100, ISOSCELES", "2, 100, 100, ISOSCELES", "199, 100, 100, ISOSCELES",
			"200, 100, 100, IsNotTriangle" })
	void testNormal(int side1, int side2, int side3, String expectedResult) {
		TriangleClassify triangle = new TriangleClassify();
		triangle.setSide(side1, side2, side3);
		String result = triangle.classify().toUpperCase();
		assertEquals(expectedResult.toUpperCase(), result);
	}

	@DisplayName("Robustness Boundary Value Test")
	@ParameterizedTest(name = "side1={0}, side2={1}, side3={2}, expectedResult={3}")
	@CsvSource({ "100, 100, 100, EQUILATERAL", "100,100,0,OUT_OF_RANGE", "100, 100, 1, ISOSCELES",
			"100, 100, 2, ISOSCELES", "100, 100, 199, ISOSCELES", "100, 100, 200, IsNotTriangle",
			"100, 100, 201, OUT_OF_RANGE", "100,0,100,OUT_OF_RANGE", "100, 1, 100, ISOSCELES", "100, 2, 100, ISOSCELES",
			"100, 199, 100, ISOSCELES", "100, 200, 100, IsNotTriangle", "100,201, 100,  OUT_OF_RANGE",
			"0,100,100,OUT_OF_RANGE", "1, 100, 100, ISOSCELES", "2, 100, 100, ISOSCELES", "199, 100, 100, ISOSCELES",
			"200, 100, 100, IsNotTriangle", "201, 100,100,  OUT_OF_RANGE", })
	void testRobust(int side1, int side2, int side3, String expectedResult) {
		TriangleClassify triangle = new TriangleClassify();
		triangle.setSide(side1, side2, side3);
		String result = triangle.classify().toUpperCase();
		assertEquals(expectedResult.toUpperCase(), result);
	}
}
