package main;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import org.junit.runner.JUnitCore;

import test.TriangleTest;
import test.CommissionTest;

public class MainFrame extends javax.swing.JFrame {

	public MainFrame() {
		initComponents();
		this.minTriangleTextField.setText("11");
		this.maxTriangleTextField.setText("220");
		this.minLockCommissionTextField.setText("1");
		this.minStockCommissionTextField.setText("1");
		this.minBarrelCommissionTextField.setText("1");
		this.maxLockCommissionTextField.setText("60");
		this.maxStockCommissionTextField.setText("70");
		this.maxBarrelCommissionTextField.setText("80");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		minTriangleTextField = new javax.swing.JTextField();
		maxTriangleTextField = new javax.swing.JTextField();
		checkTriangleButton = new javax.swing.JButton();
		clearTriangleButton = new javax.swing.JButton();
		checkTriangleDefaultButton = new javax.swing.JButton();
		jLabel14 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		minLockCommissionTextField = new javax.swing.JTextField();
		maxLockCommissionTextField = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		maxStockCommissionTextField = new javax.swing.JTextField();
		minStockCommissionTextField = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		maxBarrelCommissionTextField = new javax.swing.JTextField();
		minBarrelCommissionTextField = new javax.swing.JTextField();
		checkCommissionDefaultButton = new javax.swing.JButton();
		checkCommissionButton = new javax.swing.JButton();
		clearCommissionButton = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		normalTable = new javax.swing.JTable();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		robustTable = new javax.swing.JTable();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Lower Bound");

		jLabel2.setText("Upper Bound");

		checkTriangleButton.setText("Check");
		checkTriangleButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkTriangleButtonActionPerformed(evt);
			}
		});

		clearTriangleButton.setText("Clear");
		clearTriangleButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearTriangleButtonActionPerformed(evt);
			}
		});

		checkTriangleDefaultButton.setText("Check Default Value");
		checkTriangleDefaultButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkTriangleDefaultButtonActionPerformed(evt);
			}
		});

		jLabel14.setText("Default Value: 10 -220");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(29, 29, 29)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel2).addComponent(jLabel1))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(minTriangleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(maxTriangleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(69, 69, 69)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel14).addComponent(checkTriangleDefaultButton)
								.addGroup(jPanel1Layout.createSequentialGroup().addComponent(checkTriangleButton)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(clearTriangleButton)))
						.addContainerGap(67, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(12, 12, 12)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(minTriangleTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(checkTriangleDefaultButton))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(maxTriangleTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(checkTriangleButton).addComponent(clearTriangleButton)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel14)
						.addContainerGap(147, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Triangle", jPanel1);

		jLabel5.setText("Lower Bound");

		jLabel6.setText("Upper Bound");

		jLabel7.setText("Lock");

		jLabel8.setText("Stock");

		jLabel9.setText("Lower Bound");

		jLabel10.setText("Upper Bound");

		jLabel11.setText("Barrel");

		jLabel12.setText("Lower Bound");

		jLabel13.setText("Upper Bound");

		checkCommissionDefaultButton.setText("Check Default Value");
		checkCommissionDefaultButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkCommissionDefaultButtonActionPerformed(evt);
			}
		});

		checkCommissionButton.setText("Check");
		checkCommissionButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				checkCommissionButtonActionPerformed(evt);
			}
		});

		clearCommissionButton.setText("Clear");
		clearCommissionButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearCommissionButtonActionPerformed(evt);
			}
		});

		jLabel15.setText("Default Value:");

		jLabel16.setText("Lock: 1 - 60");

		jLabel17.setText("Stock: 1 - 70");

		jLabel18.setText("Barrel: 1 - 80");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup().addGap(48, 48, 48)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18, 18, 18).addComponent(minLockCommissionTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE, 71,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel6)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(maxLockCommissionTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE, 71,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(minStockCommissionTextField,
												javax.swing.GroupLayout.PREFERRED_SIZE, 71,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel2Layout.createSequentialGroup()
												.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE,
																85, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE,
																85, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(22, 22, 22)
												.addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(maxBarrelCommissionTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE, 71,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(minBarrelCommissionTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE, 71,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(maxStockCommissionTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE, 71,
																javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel2Layout.createSequentialGroup().addGap(207, 207, 207)
												.addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup().addGap(129, 129, 129)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(checkCommissionDefaultButton)
																.addGroup(jPanel2Layout.createSequentialGroup()
																		.addComponent(checkCommissionButton)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(clearCommissionButton))))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
														.createSequentialGroup().addComponent(jLabel15)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE,
																72, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(22, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(checkCommissionDefaultButton).addComponent(jLabel7).addComponent(jLabel5)
								.addComponent(minLockCommissionTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(checkCommissionButton).addComponent(clearCommissionButton))
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel6).addComponent(maxLockCommissionTextField,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(8, 8, 8)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel15).addComponent(jLabel16))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel17).addGap(8, 8, 8).addComponent(jLabel18))
								.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8).addComponent(jLabel9)
												.addComponent(minStockCommissionTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(5, 5, 5)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(maxStockCommissionTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel10))
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup().addGap(15, 15, 15)
														.addGroup(jPanel2Layout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(jLabel11).addComponent(jLabel12)))
												.addGroup(jPanel2Layout.createSequentialGroup().addGap(18, 18, 18)
														.addComponent(minBarrelCommissionTextField,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(maxBarrelCommissionTextField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel13))))
						.addContainerGap(22, Short.MAX_VALUE)));

		jTabbedPane1.addTab("Commission", jPanel2);

		normalTable
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(normalTable);

		jLabel3.setText("NORMAL TESTING VALUE");

		robustTable
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(robustTable);

		jLabel4.setText("ROBUSTNESS TESTING VALUE");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(32, 32, 32)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(6, 6, 6)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3))
										.addGap(53, 53, 53)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4)))
								.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 231,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, 231,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)));

		pack();
	}// </editor-fold>

	private static Object[][] normalTestData;
	private static Object[][] robustTestData;
	private static int minTriangle;
	private static int maxTriangle;
	private static int minLock;
	private static int maxLock;
	private static int minStock;
	private static int maxStock;
	private static int minBarrel;
	private static int maxBarrel;

	public static int getMinTriangle() {
		return minTriangle;
	}

	public static void setMinTriangle(int minTriangle) {
		MainFrame.minTriangle = minTriangle;
	}

	public static int getMaxTriangle() {
		return maxTriangle;
	}

	public static void setMaxTriangle(int maxTriangle) {
		MainFrame.maxTriangle = maxTriangle;
	}

	public static int getMinLock() {
		return minLock;
	}

	public static void setMinLock(int minLock) {
		MainFrame.minLock = minLock;
	}

	public static int getMaxLock() {
		return maxLock;
	}

	public static void setMaxLock(int maxLock) {
		MainFrame.maxLock = maxLock;
	}

	public static int getMinStock() {
		return minStock;
	}

	public static void setMinStock(int minStock) {
		MainFrame.minStock = minStock;
	}

	public static int getMaxStock() {
		return maxStock;
	}

	public static void setMaxStock(int maxStock) {
		MainFrame.maxStock = maxStock;
	}

	public static int getMinBarrel() {
		return minBarrel;
	}

	public static void setMinBarrel(int minBarrel) {
		MainFrame.minBarrel = minBarrel;
	}

	public static int getMaxBarrel() {
		return maxBarrel;
	}

	public static void setMaxBarrel(int maxBarrel) {
		MainFrame.maxBarrel = maxBarrel;
	}

	public void setNormalDataFromTest(Object[][] normalData) {
		normalTestData = normalData;
	}

	public void setRobustDataFromTest(Object[][] robustData) {
		robustTestData = robustData;
	}

	private void checkTriangleDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.minTriangleTextField.setText("11");
		this.maxTriangleTextField.setText("220");
		this.minTriangle = 10;
		this.maxTriangle = 220;
		org.junit.runner.Result result = JUnitCore.runClasses(TriangleTest.class);
		updateTriangleTables();
	}

	private void checkCommissionDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.minLockCommissionTextField.setText("1");
		this.minStockCommissionTextField.setText("1");
		this.minBarrelCommissionTextField.setText("1");
		this.maxLockCommissionTextField.setText("60");
		this.maxStockCommissionTextField.setText("70");
		this.maxBarrelCommissionTextField.setText("80");
		this.minLock = 1;
		this.minStock = 1;
		this.minBarrel = 1;
		this.maxLock = 60;
		this.maxStock = 70;
		this.maxBarrel = 80;
		org.junit.runner.Result result = JUnitCore.runClasses(CommissionTest.class);
		updateRobustTables();
	}

	private void checkTriangleButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.minTriangle = Integer.valueOf(minTriangleTextField.getText());
		this.maxTriangle = Integer.valueOf(maxTriangleTextField.getText());
		org.junit.runner.Result result = JUnitCore.runClasses(TriangleTest.class);
		updateTriangleTables();
	}

	private void checkCommissionButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.minLock = Integer.valueOf(minLockCommissionTextField.getText());
		this.minStock = Integer.valueOf(minStockCommissionTextField.getText());
		this.minBarrel = Integer.valueOf(minBarrelCommissionTextField.getText());
		this.maxLock = Integer.valueOf(maxLockCommissionTextField.getText());
		this.maxStock = Integer.valueOf(maxStockCommissionTextField.getText());
		this.maxBarrel = Integer.valueOf(maxBarrelCommissionTextField.getText());
		org.junit.runner.Result result = JUnitCore.runClasses(CommissionTest.class);
		updateRobustTables();
	}

	private void clearTriangleButtonActionPerformed(java.awt.event.ActionEvent evt) {
		clearTables();
	}

	private void clearCommissionButtonActionPerformed(java.awt.event.ActionEvent evt) {
		clearTables();
	}

	private void updateTriangleTables() {
		DefaultTableModel tableNormalModel = new DefaultTableModel();
		tableNormalModel.addColumn("Test case");
		tableNormalModel.addColumn("Side 1");
		tableNormalModel.addColumn("Side 2");
		tableNormalModel.addColumn("Side 3");
		tableNormalModel.addColumn("Expected Output");
		for (Object[] row : normalTestData) {
			tableNormalModel.addRow(row);
		}

		DefaultTableModel tableRobustModel = new DefaultTableModel();
		tableRobustModel.addColumn("Test case");
		tableRobustModel.addColumn("Side 1");
		tableRobustModel.addColumn("Side 2");
		tableRobustModel.addColumn("Side 3");
		tableRobustModel.addColumn("Expected Output");
		for (Object[] row : robustTestData) {
			tableRobustModel.addRow(row);
		}
		normalTable.setModel(tableNormalModel);
		robustTable.setModel(tableRobustModel);
	}
	
	private void updateRobustTables() {
		DefaultTableModel tableNormalModel = new DefaultTableModel();
		tableNormalModel.addColumn("Test case");
		tableNormalModel.addColumn("Lock");
		tableNormalModel.addColumn("Stock");
		tableNormalModel.addColumn("Barrel");
		tableNormalModel.addColumn("Expected Output");
		for (Object[] row : normalTestData) {
			tableNormalModel.addRow(row);
		}

		DefaultTableModel tableRobustModel = new DefaultTableModel();
		tableRobustModel.addColumn("Test case");
		tableRobustModel.addColumn("Side 1");
		tableRobustModel.addColumn("Side 2");
		tableRobustModel.addColumn("Side 3");
		tableRobustModel.addColumn("Expected Output");
		for (Object[] row : robustTestData) {
			tableRobustModel.addRow(row);
		}
		normalTable.setModel(tableNormalModel);
		robustTable.setModel(tableRobustModel);
	}


	public void clearTables() {
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		this.minTriangleTextField.setText("11");
		this.maxTriangleTextField.setText("220");
		this.minLockCommissionTextField.setText("1");
		this.minStockCommissionTextField.setText("1");
		this.minBarrelCommissionTextField.setText("1");
		this.maxLockCommissionTextField.setText("60");
		this.maxStockCommissionTextField.setText("70");
		this.maxBarrelCommissionTextField.setText("80");
		normalTable.setModel((defaultTableModel));
		robustTable.setModel((defaultTableModel));
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton checkCommissionButton;
	private javax.swing.JButton checkCommissionDefaultButton;
	private javax.swing.JButton checkTriangleButton;
	private javax.swing.JButton checkTriangleDefaultButton;
	private javax.swing.JButton clearCommissionButton;
	private javax.swing.JButton clearTriangleButton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField maxBarrelCommissionTextField;
	private javax.swing.JTextField maxLockCommissionTextField;
	private javax.swing.JTextField maxStockCommissionTextField;
	private javax.swing.JTextField maxTriangleTextField;
	private javax.swing.JTextField minBarrelCommissionTextField;
	private javax.swing.JTextField minLockCommissionTextField;
	private javax.swing.JTextField minStockCommissionTextField;
	private javax.swing.JTextField minTriangleTextField;
	private javax.swing.JTable normalTable;
	private javax.swing.JTable robustTable;
	// End of variables declaration
}
