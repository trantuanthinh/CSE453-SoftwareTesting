package PersonalNumber;

public class PersonalNumber {

	private String personalNumber;

	public PersonalNumber(String personalNumber) {
		if (!isValidPersonalNumberFormat(personalNumber)) {
			throw new IllegalArgumentException("Invalid personal number");
		}
		this.personalNumber = personalNumber;
	}

	public String getDate() {
		return personalNumber.substring(0, 6);
	}

	public String getYear() {
		return personalNumber.substring(0, 2);
	}

	public String getMonth() {
		return personalNumber.substring(2, 4);
	}

	public String getSex() {
		int z = Integer.parseInt(personalNumber.substring(8, 9));
		return (z % 2 == 0) ? "female" : "male";
	}

	public String getCheckSum() {
		int[] multiplicationFactors = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
		int sum = 0;

		for (int i = 0; i < personalNumber.length() - 1; i++) {
			int digit = Character.getNumericValue(personalNumber.charAt(i)) * multiplicationFactors[i];
			sum += (digit >= 10) ? digit - 9 : digit;
		}

		int checksum = (sum % 10 == 0) ? 0 : 10 - (sum % 10);
		return Integer.toString(checksum);
	}

	private boolean isValidPersonalNumberFormat(String personalNumber) {
		return personalNumber.matches("\\d{6}-\\d{3}");
	}
}
