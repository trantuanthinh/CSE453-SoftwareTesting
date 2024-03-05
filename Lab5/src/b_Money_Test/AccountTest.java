package b_Money_Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import b_Money.Account;
import b_Money.AccountDoesNotExistException;
import b_Money.Bank;
import b_Money.Currency;
import b_Money.Money;

public class AccountTest {
	Currency SEK;
	Bank SweBank;
	Account testAccount;

	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		SweBank.openAccount("Alice");
		testAccount = new Account("Hans", SEK);
		testAccount.deposit(new Money(10000000, SEK));
		SweBank.deposit("Alice", new Money(1000000, SEK));
	}

	@Test
	public void testAddRemoveTimedPayment() {
		assertFalse(testAccount.timedPaymentExists("1"));
		testAccount.addTimedPayment("1", 1, 2, new Money(100, SEK), SweBank, "Alice");
		assertTrue(testAccount.timedPaymentExists("1"));
		testAccount.removeTimedPayment("1");
		assertFalse(testAccount.timedPaymentExists("1"));
	}

	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		SweBank.transfer("Alice", SweBank, "Hans", new Money(500000, SEK));
		assertTrue(testAccount.getBalance().getAmount() > 0);
		testAccount.tick();
		assertEquals(0, (int) testAccount.getBalance().getAmount());
	}

	@Test
	public void testAddWithdraw() {
		testAccount.deposit(new Money(500000, SEK));
		assertEquals(10500000, (int) testAccount.getBalance().getAmount());
		testAccount.withdraw(new Money(300000, SEK));
		assertEquals(10200000, (int) testAccount.getBalance().getAmount());
	}

	@Test
	public void testGetBalance() {
		assertEquals(10000000, (int) testAccount.getBalance().getAmount());
		testAccount.deposit(new Money(500000, SEK));
		assertEquals(10500000, (int) testAccount.getBalance().getAmount());
	}
}
