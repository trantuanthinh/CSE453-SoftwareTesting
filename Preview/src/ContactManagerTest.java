import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactManagerTest {

	@Test
	@DisplayName("Should Create Contact")
	public void shouldCreateContact() {
		ContactManager contactManager = new ContactManager();
		contactManager.addContact("John", "Doe", "0123456789");
		assertFalse(contactManager.getAllContacts().isEmpty());
		assertEquals(1, contactManager.getAllContacts().size());
	}
	
	@Test
	@DisplayName("Should Not Create Contact When First Name is Null")
	public void shouldThrownRunTimeExceptionWhenFirstNameIsNull() {
		ContactManager contactManager = new ContactManager();
		assertThrows(RuntimeException.class, ()->{
			contactManager.addContact(null, "Doe", "0123456");
		});
	}
}
