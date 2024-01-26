package Exercise3;

public class Client_Product {
	String Gender;
	String City_Dwellers;
	String productTypes = "No Product";
	int age;

	public void setInput(String Gender, String City_Dwellers, int age) {
		this.Gender = Gender;
		this.City_Dwellers = City_Dwellers;
		this.age = age;
	}

	public String assignProduct() {
		if (Gender.equals("Female")) {
			if (City_Dwellers.equals("Yes")) {
				// Bug: it should return the String "productTypes" if 1 condition "if" is
				// executed and "productTypes" is assigned
				if ((age < 35)) {
					productTypes = "W X and Y";
					// return String "productTypes"
					return productTypes;
				}
				//The condition of this should be (age >= 35) && (age <= 65)
				if ((age >= 35) || (age <= 65)) {
					productTypes = "X and Y";
					// return String "productTypes"
					return productTypes;
				}
				if (age > 65) {
					productTypes = "Only Y";
					// return String "productTypes"
					return productTypes;
				}
			} else if (City_Dwellers.contentEquals("No")) {
				if ((age < 35)) {
					productTypes = "W and X";
					// return String "productTypes"
					return productTypes;
				}
				if ((age >= 35) && (age <= 65)) {
					productTypes = "Only X";
					// return String "productTypes"
					return productTypes;
				}
				//Missing age is greater than 65: productTypes = "Only X";
			}
		} else if (Gender.contentEquals("Male")) {
			if (City_Dwellers.contentEquals("Yes")) {
				if ((age < 35) || (age >= 35) && (age <= 65) || (age > 65)) {
					productTypes = "Only X";
					// return String "productTypes"
					return productTypes;
				}

			} else if (City_Dwellers.contentEquals("No")) {
				//The condition of this should be (age < 35) || (age > 65)
				if ((age < 35) && (age > 65)) {
					productTypes = "Only X";
					// return String "productTypes"
					return productTypes;
				}
				if ((age >= 35) && (age <= 65)) {
					//It should be productTypes = "X and Z";
					productTypes = "W and Z";
					// return String "productTypes"
					return productTypes;
				}
			}
		}
		return productTypes;
	}

}
