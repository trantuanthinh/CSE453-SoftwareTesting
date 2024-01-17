public class ExampleStaticAnalysis {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String nameCompare() {
		if (firstName.equals(lastName))
			return this.firstName;
		else
			return this.firstName + " " + this.lastName;
	}
}
