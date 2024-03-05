package b_Money_Test;

import b_Money.Currency;
import b_Money.Money;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {
	Currency SEK, DKK, NOK, EUR;
	Money SEK100, EUR10, SEK200, EUR20, SEK0, EUR0, SEKn100;

	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
		SEK100 = new Money(10000, SEK);
		EUR10 = new Money(1000, EUR);
		SEK200 = new Money(20000, SEK);
		EUR20 = new Money(2000, EUR);
		SEK0 = new Money(0, SEK);
		EUR0 = new Money(0, EUR);
		SEKn100 = new Money(-10000, SEK);
	}

	@Test
	public void testGetAmount() {
		assertEquals(Integer.valueOf(10000), SEK100.getAmount());
		assertEquals(Integer.valueOf(0), SEK0.getAmount());
		assertEquals(Integer.valueOf(-10000), SEKn100.getAmount());
	}

	@Test
	public void testGetCurrency() {
		assertEquals(SEK, SEK100.getCurrency());
		assertEquals(EUR, EUR0.getCurrency());
	}

	@Test
	public void testToString() {
		assertEquals("10000 SEK", SEK100.toString());
		assertEquals("0 SEK", SEK0.toString());
		assertEquals("-10000 SEK", SEKn100.toString());
	}

	@Test
	public void testUniversalValue() {
		assertEquals(Integer.valueOf(1500), EUR10.universalValue());
		assertEquals(Integer.valueOf(30000), SEK200.universalValue());
	}

	@Test
	public void testEquals() {
		assertTrue(SEK100.equals(SEK100));
		assertFalse(SEK100.equals(EUR10));
		assertFalse(SEK100.equals(null));
	}

	@Test
	public void testAdd() {
		Money result = SEK100.add(EUR10);
		assertEquals(new Money(11500, SEK), result);
	}

	@Test
	public void testSub() {
		Money result = SEK100.sub(EUR10);
		assertEquals(new Money(8500, SEK), result);
	}

	@Test
	public void testIsZero() {
		assertTrue(SEK0.isZero());
		assertFalse(SEK100.isZero());
	}

	@Test
	public void testNegate() {
		Money result = SEK100.negate();
		assertEquals(new Money(-10000, SEK), result);
	}

	@Test
	public void testCompareTo() {
		assertEquals(0, SEK100.compareTo(SEK100));
		assertTrue(SEK100.compareTo(EUR10) < 0);
		assertTrue(EUR10.compareTo(SEK100) > 0);
	}
}
