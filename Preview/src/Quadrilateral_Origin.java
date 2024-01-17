public class Quadrilateral_Origin {
	private int topSide;
	private int bottomSide;
	private int leftSide;
	private int rightSide;
	public void setSide(int s1, int s2, int s3, int s4)
	{
		this.topSide=s1;
		this.bottomSide=s2;
		this.leftSide=s3;
		this.rightSide=s4;
	}
	
	public String classify() {
	    if (isOutOfRange()) {
	        return "OUT_OF_RANGE";
	    } else if (isScaleneQuadrilateral()) {
	        return "Scalene Quadrilateral_Origin";
	    } else if (isSquare()) {
	        return "Square";
	    } else if (isRectangle()) {
	        return "Rectangle";
	    } else if (isTrapezoid()) {
	        return "Trapezoid";
	    } else if (isKite()) {
	        return "Kite";
	    } else {
	        return "General";
	    }
	}

	private boolean isOutOfRange() {
	    return !(isValidSide(topSide) && isValidSide(bottomSide) && isValidSide(leftSide) && isValidSide(rightSide));
	}

	private boolean isValidSide(int side) {
	    return 1 <= side && side <= 200;
	}

	private boolean isScaleneQuadrilateral() {
	    return (topSide != bottomSide) && (topSide != leftSide) && (topSide != rightSide) &&
	           (bottomSide != leftSide) && (bottomSide != rightSide) && (rightSide != leftSide);
	}

	private boolean isSquare() {
	    return topSide == bottomSide && bottomSide == leftSide && leftSide == rightSide;
	}

	private boolean isRectangle() {
	    return topSide == bottomSide;
	}

	private boolean isTrapezoid() {
	    return leftSide == rightSide;
	}

	private boolean isKite() {
	    return topSide == rightSide && bottomSide == leftSide;
	}

	
	}
