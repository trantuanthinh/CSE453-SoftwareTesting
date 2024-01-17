public class Quadrilateral_Solution {
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
	public String classify()
	{
		String quadrilateralType;
		if(!checkRange())
		{
			if ((topSide!=bottomSide) && (topSide!=leftSide) && (topSide!=rightSide) && 
	           		 (bottomSide!=leftSide) && (bottomSide!=rightSide) && (rightSide!=leftSide))
	        		   quadrilateralType = "Scalene Quadrilateral_Origin";
	        	else if ((topSide == bottomSide) && (bottomSide == leftSide) && (leftSide == rightSide))
	         		quadrilateralType = "Square";
	        	else if((topSide == bottomSide) && (leftSide == rightSide))
	        		quadrilateralType = "Rectangle";
	        	else if(leftSide == rightSide)
	           	 	quadrilateralType = "Trapezoid";
	        	else if((topSide == rightSide) && (bottomSide == leftSide))
	        		quadrilateralType = "Kite";
	             else
	            	 quadrilateralType = "General";	
		}
        else quadrilateralType="OUT_OF_RANGE";
        return quadrilateralType;
        }
   
	public boolean checkRange()
	{
		boolean c1;
		boolean c2;
		boolean c3;
		boolean c4;
		
        c1 = (1 <= topSide) && (topSide <= 200);
        c2 = (1 <= bottomSide) && (bottomSide <= 200);
        c3 = (1 <= leftSide) && (leftSide <= 200);
        c4 = (1 <= rightSide) && (rightSide <= 200);
        
       return (!c1 || !c2 || !c3 || !c4);
        	
	}
	
}
