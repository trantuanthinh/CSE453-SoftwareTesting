package test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;

import main.Triangle;
import main.MainFrame;

import java.util.Arrays;
import java.util.Collection;

public class TriangleTest {
	private static MainFrame mainFrame = new MainFrame();
	private int min = mainFrame.getMinTriangle();
	private int max = mainFrame.getMaxTriangle();

	@DisplayName("Normal Boundary Testing Value")
	@Test
	public void test1() {
		Collection<Object[]> boundaryTestCases = generateNormalBoundaryTestCases(this.min, this.max);
		Object[][] data = runTestCases(boundaryTestCases);
		this.mainFrame.setNormalDataFromTest(data);
	}

	@DisplayName("Robustness Boundary Testing Value")
	@Test
	public void test2() {
		Collection<Object[]> robustnessTestCases = generateRobustnessTestCases(this.min, this.max);
		Object[][] data = runTestCases(robustnessTestCases);
		this.mainFrame.setRobustDataFromTest(data);
	}

	private Object[][] runTestCases(Collection<Object[]> testCases) {
		int count = 1;
		Object[][] data = new Object[testCases.size()][5];
		int rowIndex = 0;

		for (Object[] testCase : testCases) {
			int side1 = (int) testCase[0];
			int side2 = (int) testCase[1];
			int side3 = (int) testCase[2];

			Triangle triangle = new Triangle();
			triangle.setSide(side1, side2, side3);
			String result = triangle.classify().toUpperCase();

			data[rowIndex] = new Object[] { count, side1, side2, side3, result };
			count++;
			rowIndex++;
		}
		return data;
	}

	// Helper method to generate test cases for boundary value analysis
	private Collection<Object[]> generateNormalBoundaryTestCases(int min, int max) {
		int minPlus = min + 1;
		int nom = (int) Math.ceil((min + max) / 2);
		int maxMinus = max - 1;
		return Arrays.asList(new Object[] { nom, nom, nom }, new Object[] { nom, nom, min },
				new Object[] { nom, nom, minPlus }, new Object[] { nom, nom, maxMinus }, new Object[] { nom, nom, max },
				new Object[] { nom, min, nom }, new Object[] { nom, minPlus, nom }, new Object[] { nom, maxMinus, nom },
				new Object[] { nom, max, nom }, new Object[] { min, nom, nom }, new Object[] { minPlus, nom, nom },
				new Object[] { maxMinus, nom, nom }, new Object[] { max, nom, nom });
	}

	// Helper method to generate test cases for robustness boundary value analysis
	private Collection<Object[]> generateRobustnessTestCases(int min, int max) {
		int minMinus = min - 1;
		int minPlus = min + 1;
		int nom = (int) Math.ceil((min + max) / 2);
		int maxMinus = max - 1;
		int maxPlus = max + 1;
		return Arrays.asList(new Object[] { nom, nom, nom }, new Object[] { nom, nom, minMinus },
				new Object[] { nom, nom, min }, new Object[] { nom, nom, minPlus }, new Object[] { nom, nom, maxMinus },
				new Object[] { nom, nom, max }, new Object[] { nom, nom, maxPlus }, new Object[] { nom, minMinus, nom },
				new Object[] { nom, min, nom }, new Object[] { nom, minPlus, nom }, new Object[] { nom, maxMinus, nom },
				new Object[] { nom, max, nom }, new Object[] { nom, maxPlus, nom }, new Object[] { minMinus, nom, nom },
				new Object[] { min, nom, nom }, new Object[] { minPlus, nom, nom }, new Object[] { maxMinus, nom, nom },
				new Object[] { max, nom, nom }, new Object[] { maxPlus, nom, nom });
	}
}
