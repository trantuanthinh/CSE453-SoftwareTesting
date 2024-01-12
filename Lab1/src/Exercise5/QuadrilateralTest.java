package Exercise5;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

class QuadrilateralTest {

	@Test
	void testMainMethodExists() {
		try {
			Class<?> className = Class.forName("Quadrilateral");
			Method mainMethod = className.getMethod("main", String[].class);
		} catch (ClassNotFoundException e) {
			assertTrue(false, "Class not found");
		} catch (NoSuchMethodException e) {
			assertTrue(false, "Main method not found");
		}
	}
	
	@Test
	void testMaMethodExists() {
		try {
			Class<?> className = Class.forName("Quadrilateral");
			Method mainMethod = className.getMethod("main", String[].class);
		} catch (ClassNotFoundException e) {
			assertTrue(false, "Class not found");
		} catch (NoSuchMethodException e) {
			assertTrue(false, "Main method not found");
		}
	}

}