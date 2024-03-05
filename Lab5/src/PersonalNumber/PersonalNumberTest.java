package PersonalNumber;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonalNumberTest {

	@Test
	public void testValidPersonalNumber() {
		PersonalNumber personalNumber = new PersonalNumber("640823-323");
		assertEquals("640823", personalNumber.getDate());
		assertEquals("64", personalNumber.getYear());
		assertEquals("08", personalNumber.getMonth());
		assertEquals("female", personalNumber.getSex());
		assertEquals("3", personalNumber.getCheckSum());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidPersonalNumber() {
		new PersonalNumber("123456-789");
	}

	@Test
	public void testGetDate() {
		PersonalNumber personalNumber = new PersonalNumber("640823-323");
		assertEquals("640823", personalNumber.getDate());
	}

	@Test
	public void testGetYear() {
		PersonalNumber personalNumber = new PersonalNumber("640823-323");
		assertEquals("64", personalNumber.getYear());
	}

	@Test
	public void testGetMonth() {
		PersonalNumber personalNumber = new PersonalNumber("640823-323");
		assertEquals("08", personalNumber.getMonth());
	}

	@Test
	public void testGetSex() {
		PersonalNumber female = new PersonalNumber("640823-324");
		assertEquals("female", female.getSex());

		PersonalNumber male = new PersonalNumber("640823-323");
		assertEquals("male", male.getSex());
	}

	@Test
	public void testGetCheckSum() {
		PersonalNumber personalNumber = new PersonalNumber("640823-323");
		assertEquals("4", personalNumber.getCheckSum());
	}

}
