package Exercise5;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class QuadrilateralTest {

	@Test
	void testIsRectangle() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(3, 2);
		Point p4 = new Point(3, 0);
		Quadrilateral quad = new Quadrilateral(p1, p2, p3, p4);
		assertTrue(quad.isRectangle());
	}

	@Test
	void testIsSquare() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(2, 2);
		Point p4 = new Point(2, 0);
		Quadrilateral quad = new Quadrilateral(p1, p2, p3, p4);
		assertTrue(quad.isSquare());
	}

	@Test
	void testIsNotSquare() {
		Point p1 = new Point(0, 1);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(3, 2);
		Point p4 = new Point(3, 0);
		Quadrilateral quad = new Quadrilateral(p1, p2, p3, p4);
		assertFalse(quad.isSquare());
	}

}
