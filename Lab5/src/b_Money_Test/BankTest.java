package b_Money_Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import b_Money.Account;
import b_Money.AccountDoesNotExistException;
import b_Money.AccountExistsException;
import b_Money.Bank;
import b_Money.Currency;
import b_Money.Money;

public class BankTest {
    Currency SEK, DKK;
    Bank SweBank, Nordea, DanskeBank;

    @Before
    public void setUp() throws Exception {
        DKK = new Currency("DKK", 0.20);
        SEK = new Currency("SEK", 0.15);
        SweBank = new Bank("SweBank", SEK);
        Nordea = new Bank("Nordea", SEK);
        DanskeBank = new Bank("DanskeBank", DKK);
        SweBank.openAccount("Ulrika");
        SweBank.openAccount("Bob");
        Nordea.openAccount("Bob");
        DanskeBank.openAccount("Gertrud");
    }

    @Test
    public void testGetName() {
        assertEquals("SweBank", SweBank.getName());
        assertEquals("Nordea", Nordea.getName());
        assertEquals("DanskeBank", DanskeBank.getName());
    }

    @Test
    public void testGetCurrency() {
        assertEquals(SEK, SweBank.getCurrency());
        assertEquals(SEK, Nordea.getCurrency());
        assertEquals(DKK, DanskeBank.getCurrency());
    }

    @Test
    public void testOpenAccount() throws AccountExistsException, AccountDoesNotExistException {
        SweBank.openAccount("Alice");
        assertTrue(SweBank.getBalance("Alice") == 0); // Check the balance of the newly opened account
    }

    @Test
    public void testDeposit() throws AccountDoesNotExistException {
        SweBank.deposit("Bob", new Money(5000, SEK));
        assertEquals(5000, SweBank.getBalance("Bob").intValue());
    }

    @Test
    public void testWithdraw() throws AccountDoesNotExistException {
        SweBank.deposit("Bob", new Money(10000, SEK));
        SweBank.withdraw("Bob", new Money(3000, SEK));
        assertEquals(7000, SweBank.getBalance("Bob").intValue());
    }

    @Test
    public void testGetBalance() throws AccountDoesNotExistException {
        SweBank.deposit("Bob", new Money(15000, SEK));
        assertEquals(15000, SweBank.getBalance("Bob").intValue());
    }

    @Test
    public void testTransfer() throws AccountDoesNotExistException {
        SweBank.deposit("Alice", new Money(2000, SEK));
        Nordea.transfer("Bob", SweBank, "Alice", new Money(1000, SEK));
        assertEquals(3000, SweBank.getBalance("Alice").intValue());
    }

    @Test
    public void testTimedPayment() throws AccountDoesNotExistException {
        try {
			SweBank.openAccount("Charlie");
		} catch (AccountExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        SweBank.addTimedPayment("Charlie", "1", 2, 1, new Money(100, SEK), Nordea, "Bob");
        assertTrue(SweBank.getBalance("Charlie") == 0);
    }
}
