package test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;

import main.Commission;
import main.MainFrame;

import java.util.Arrays;
import java.util.Collection;

public class CommissionTest {
	private static MainFrame mainFrame = new MainFrame();
	private int minLock = mainFrame.getMinLock();
	private int minStock = mainFrame.getMinStock();
	private int minBarrel = mainFrame.getMinBarrel();

	private int maxLock = mainFrame.getMaxLock();
	private int maxStock = mainFrame.getMaxStock();
	private int maxBarrel = mainFrame.getMaxBarrel();

	@DisplayName("Normal Boundary Testing Value")
	@Test
	public void test1() {
		Collection<Object[]> boundaryTestCases = generateNormalBoundaryTestCases(this.minLock, this.minStock,
				this.minBarrel, this.maxLock, this.maxStock, this.maxBarrel);
		Object[][] data = runTestCases(boundaryTestCases);
		this.mainFrame.setNormalDataFromTest(data);
	}

	@DisplayName("Robustness Boundary Testing Value")
	@Test
	public void test2() {
		Collection<Object[]> robustnessTestCases = generateRobustnessTestCases(this.minLock, this.minStock,
				this.minBarrel, this.maxLock, this.maxStock, this.maxBarrel);
		Object[][] data = runTestCases(robustnessTestCases);
		this.mainFrame.setRobustDataFromTest(data);
	}

	private Object[][] runTestCases(Collection<Object[]> testCases) {
		int count = 1;
		Object[][] data = new Object[testCases.size()][5];
		int rowIndex = 0;

		for (Object[] testCase : testCases) {
			int locks = (int) testCase[0];
			int stocks = (int) testCase[1];
			int barrels = (int) testCase[2];

			Commission commission = new Commission();
			commission.setInput(locks, stocks, barrels);
			double sale = commission.calSale();
			double result = commission.calCommission(sale);
			data[rowIndex] = new Object[] { count, locks, stocks, barrels, result };
			count++;
			rowIndex++;
		}
		return data;
	}

	// Helper method to generate test cases for boundary value analysis
	private Collection<Object[]> generateNormalBoundaryTestCases(int minLock, int minStock, int minBarrel, int maxLock,
			int maxStock, int maxBarrel) {
		int minLockPlus = minLock + 1;
		int nomLock = (int) Math.ceil((minLock + maxLock) / 2);
		int maxLockMinus = maxLock - 1;

		int minStockPlus = minStock + 1;
		int nomStock = (int) Math.ceil((minStock + maxStock) / 2);
		int maxStockMinus = maxStock - 1;

		int minBarrelPlus = minBarrel + 1;
		int nomBarrel = (int) Math.ceil((minBarrel + maxBarrel) / 2);
		int maxBarrelMinus = maxBarrel - 1;

		return Arrays.asList(new Object[] { nomLock, nomStock, nomBarrel },
				new Object[] { nomLock, nomStock, minBarrel }, new Object[] { nomLock, nomStock, minBarrelPlus },
				new Object[] { nomLock, nomStock, maxBarrelMinus }, new Object[] { nomLock, nomStock, maxBarrel },
				new Object[] { nomLock, minStock, nomBarrel }, new Object[] { nomLock, minStockPlus, nomBarrel },
				new Object[] { nomLock, maxStockMinus, nomBarrel }, new Object[] { nomLock, maxStock, nomBarrel },
				new Object[] { minLock, nomStock, nomBarrel }, new Object[] { minLockPlus, nomStock, nomBarrel },
				new Object[] { maxLockMinus, nomStock, nomBarrel }, new Object[] { maxLock, nomStock, nomBarrel });
	}

	// Helper method to generate test cases for robustness boundary value analysis
	private Collection<Object[]> generateRobustnessTestCases(int minLock, int minStock, int minBarrel, int maxLock,
			int maxStock, int maxBarrel) {
		int minLockMinus = minLock - 1;
		int minLockPlus = minLock + 1;
		int nomLock = (int) Math.ceil((minLock + maxLock) / 2);
		int maxLockMinus = maxLock - 1;
		int maxLockPlus = maxLock + 1;

		int minStockMinus = minStock - 1;
		int minStockPlus = minStock + 1;
		int nomStock = (int) Math.ceil((minStock + maxStock) / 2);
		int maxStockMinus = maxStock - 1;
		int maxStockPlus = maxStock + 1;

		int minBarrelMinus = minBarrel - 1;
		int minBarrelPlus = minBarrel + 1;
		int nomBarrel = (int) Math.ceil((minBarrel + maxBarrel) / 2);
		int maxBarrelMinus = maxBarrel - 1;
		int maxBarrelPlus = maxBarrel + 1;

		return Arrays.asList(new Object[] { nomLock, nomStock, nomBarrel },
				new Object[] { nomLock, nomStock, minBarrelMinus }, new Object[] { nomLock, nomStock, minBarrel },
				new Object[] { nomLock, nomStock, minBarrelPlus }, new Object[] { nomLock, nomStock, maxBarrelMinus },
				new Object[] { nomLock, nomStock, maxBarrel }, new Object[] { nomLock, nomStock, maxBarrelPlus },
				new Object[] { nomLock, minStockMinus, nomBarrel }, new Object[] { nomLock, minStock, nomBarrel },
				new Object[] { nomLock, minStockPlus, nomBarrel }, new Object[] { nomLock, maxStockMinus, nomBarrel },
				new Object[] { nomLock, maxStock, nomBarrel }, new Object[] { nomLock, maxLockPlus, nomBarrel },
				new Object[] { minLockMinus, nomStock, nomBarrel }, new Object[] { minLock, nomStock, nomBarrel },
				new Object[] { minLockPlus, nomStock, nomBarrel }, new Object[] { maxLockMinus, nomStock, nomBarrel },
				new Object[] { maxLock, nomStock, nomBarrel }, new Object[] { maxLockPlus, nomStock, nomBarrel });
	}

}
