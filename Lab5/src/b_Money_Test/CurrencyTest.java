package b_Money_Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import b_Money.Currency;

public class CurrencyTest {
    Currency SEK, DKK, NOK, EUR;

    @Before
    public void setUp() throws Exception {
        SEK = new Currency("SEK", 0.15);
        DKK = new Currency("DKK", 0.20);
        EUR = new Currency("EUR", 1.5);
    }

    @Test
    public void testGetName() {
        assertEquals("SEK", SEK.getName());
        assertEquals("DKK", DKK.getName());
        assertEquals("EUR", EUR.getName());
    }

    @Test
    public void testGetRate() {
        assertEquals(0.15, SEK.getRate(), 0.001);
        assertEquals(0.20, DKK.getRate(), 0.001);
        assertEquals(1.5, EUR.getRate(), 0.001);
    }

    @Test
    public void testSetRate() {
        SEK.setRate(0.18);
        assertEquals(0.18, SEK.getRate(), 0.001);
    }

    @Test
    public void testUniversalValue() {
        assertEquals(150, SEK.universalValue(1000).intValue());
        assertEquals(300, DKK.universalValue(1500).intValue());
        assertEquals(4500, EUR.universalValue(3000).intValue());
    }

    @Test
    public void testValueInThisCurrency() {
        assertEquals(1000, SEK.valueInThisCurrency(150, EUR).intValue());
        assertEquals(1500, DKK.valueInThisCurrency(300, SEK).intValue());
        assertEquals(3000, EUR.valueInThisCurrency(4500, DKK).intValue());
    }
}
