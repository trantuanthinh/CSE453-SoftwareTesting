package main;

public class Triangle {

	private int side1;
	private int side2;
	private int side3;

	public void setSide(int s1, int s2, int s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}

	public int getSide1() {
		return side1;
	}

	public int getSide2() {
		return side2;
	}

	public int getSide3() {
		return side3;
	}

	public String classify() {
		if (!areSidesInRange()) {
			return "OUT_OF_RANGE";
		}

		if (!isTriangle()) {
			return "IsNotTriangle";
		}

		if (isEquilateral()) {
			return "EQUILATERAL";
		} else if (isScalene()) {
			return "SCALENE";
		} else {
			return "ISOSCELES";
		}
	}

	public boolean isTriangle() {
		return (side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2);
	}

	private boolean areSidesInRange() {
		int lowerRange = 10;
		int upperRange = 220;
		return (lowerRange <= side1) && (side1 <= upperRange) && (lowerRange <= side2) && (side2 <= upperRange)
				&& (lowerRange <= side3) && (side3 <= upperRange);
	}

	private boolean isEquilateral() {
		return (side1 == side2) && (side2 == side3);
	}

	private boolean isScalene() {
		return (side1 != side2) && (side1 != side3) && (side2 != side3);
	}
}
