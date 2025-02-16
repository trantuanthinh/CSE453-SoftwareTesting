package Exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vector2DTest {

	@Test
	void testDotProduct() {
		Vector2D vector1 = new Vector2D(2, 3);
		Vector2D vector2 = new Vector2D(4, -1);
		int result = vector1.dotProduct(vector2);
		assertEquals(5, result);
	}

	@Test
	void testIsOrthogonalTo() {
		Vector2D vector1 = new Vector2D(1, 0);
		Vector2D vector2 = new Vector2D(0, -1);
		boolean result = vector1.isOrthogonalTo(vector2);
		assertTrue(result);
	}

	@Test
	void testIsNotOrthogonalTo() {
		Vector2D vector1 = new Vector2D(2, 3);
		Vector2D vector2 = new Vector2D(4, -1);
		boolean result = vector1.isOrthogonalTo(vector2);
		assertFalse(result);
	}

	@Test
	void testConstructVectorFromPoints() {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 5);
		Vector2D vector = new Vector2D(p1, p2);
		assertEquals(2, vector.x);
		assertEquals(3, vector.y);
	}

}
