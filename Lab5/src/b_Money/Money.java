package b_Money;

public class Money implements Comparable<Money> {
	private Integer amount;
	private Currency currency;

	/**
	 * New Money
	 *
	 * @param amount   The amount of money
	 * @param currency The currency of the money
	 */
	public Money(Integer amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	/**
	 * Return the amount of money.
	 *
	 * @return Amount of money as an Integer.
	 */
	public Integer getAmount() {
		return amount;
	}

	/**
	 * Returns the currency of this Money.
	 *
	 * @return Currency object representing the currency of this Money
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * Returns the amount of the money in the string form "(amount) (currencyname)",
	 * e.g. "10.5 SEK".
	 *
	 * @return String representing the amount of Money.
	 */
	public String toString() {
		return amount + " " + currency.getName();
	}

	/**
	 * Gets the universal value of the Money, according to the rate of its Currency.
	 *
	 * @return The value of the Money in the "universal currency".
	 */
	public Integer universalValue() {
		return (int) Math.round(amount * currency.getRate());
	}

	/**
	 * Check to see if the value of this money is equal to the value of another
	 * Money of some other Currency.
	 *
	 * @param other The other Money that is being compared to this Money.
	 * @return A Boolean indicating if the two monies are equal.
	 */
	public boolean equals(Money other) {
		return this.universalValue().equals(other.universalValue());
	}

	/**
	 * Adds a Money to this Money, regardless of the Currency of the other Money.
	 *
	 * @param other The Money that is being added to this Money.
	 * @return A new Money with the same Currency as this Money, representing the
	 *         added value of the two.
	 */
	public Money add(Money other) {
		int newAmount = this.amount + other.getAmount();
		return new Money(newAmount, this.currency);
	}

	/**
	 * Subtracts a Money from this Money, regardless of the Currency of the other
	 * Money.
	 *
	 * @param other The money that is being subtracted from this Money.
	 * @return A new Money with the same Currency as this Money, representing the
	 *         subtracted value.
	 */
	public Money sub(Money other) {
		int newAmount = this.amount - other.getAmount();
		return new Money(newAmount, this.currency);
	}

	/**
	 * Check to see if the amount of this Money is zero or not.
	 *
	 * @return True if the amount of this Money is equal to 0, False otherwise
	 */
	public boolean isZero() {
		return this.amount.equals(0);
	}

	/**
	 * Negate the amount of money.
	 *
	 * @return A new instance of the money class initialized with the new negated
	 *         money amount.
	 */
	public Money negate() {
		int newAmount = -this.amount;
		return new Money(newAmount, this.currency);
	}

	/**
	 * Compare two Monies.
	 *
	 * @param other The other Money that is being compared to this Money.
	 * @return 0 if the values of the monies are equal. A negative integer if this
	 *         Money is less valuable than the other Money. A positive integer if
	 *         this Money is more valuable than the other Money.
	 */
	public int compareTo(Money other) {
		return this.universalValue().compareTo(other.universalValue());
	}
}
