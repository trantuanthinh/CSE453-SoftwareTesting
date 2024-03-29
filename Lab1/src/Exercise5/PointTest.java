package Exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testAddAndSub() {
		Point point1 = new Point(2, 4);
		Point point2 = new Point(5, 10);
		Point actualAdd = point1.add(point2);
		Point expectedAdd = new Point(7, 14);
		Point actualSub = point1.sub(point2);
		Point expectedSub = new Point(-3, -6);
		assertEquals(expectedAdd.x, actualAdd.x);
		assertEquals(expectedAdd.y, actualAdd.y);
		assertEquals(expectedSub.x, actualSub.x);
		assertEquals(expectedSub.y, actualSub.y);
	}
}
