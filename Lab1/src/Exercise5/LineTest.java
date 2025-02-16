package Exercise5;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import Exercise4.Fibonacci;

class LineTest {

	@Test
	void testSameLength() {
		Point point1 = new Point(2, 4);
		Point point2 = new Point(5, 10);
		Line line1 = new Line(point1, point2);
		
		Point point3 = new Point(4, 8);
		Point point4 = new Point(7, 14);
		Line line2 = new Line(point3, point4);
		assertTrue(line1.isSameLengthAs(line2));
	}
}
