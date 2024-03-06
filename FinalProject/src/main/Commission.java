package main;

public class Commission {
	private int totalLocks;
	private int totalStocks;
	private int totalBarrels;
	private double lockPrice;
	private double stockPrice;
	private double barrelPrice;

	public Commission() {
		lockPrice = 30.0;
		stockPrice = 35.0;
		barrelPrice = 40.0;
	}

	public void setInput(int locks, int stocks, int barrels) {
		this.totalLocks = locks;
		this.totalStocks = stocks;
		this.totalBarrels = barrels;
	}

	public int getTotalLocks() {
		return totalLocks;
	}

	public int getTotalStocks() {
		return totalStocks;
	}

	public int getTotalBarrales() {
		return totalBarrels;
	}

	public double calSale() {
		double sales;
		double lockSales;
		double stockSales;
		double barrelSale;
		lockSales = lockPrice * totalLocks;
		stockSales = stockPrice * totalStocks;
		barrelSale = barrelPrice * totalBarrels;
		sales = lockSales + stockSales + barrelSale;
		return sales;
	}

	public double calCommission(double sales) {
		double commission;
		boolean c1;
		boolean c2;
		boolean c3;

		if (sales > 1800) {
			commission = 0.10 * 1000.0;
			commission = commission + 0.15 * 800;
			commission = commission + 0.20 * (sales - 1800.0);
		} else if (sales > 1000) {
			commission = 0.10 * 1000;
			commission = commission + 0.15 * (sales - 1000);
		} else
			commission = 0.10 * sales;
		return commission;
	}
}
