package contactMain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContactTest {
// test that a contact is created successfully with valid inputs
    @Test
    public void testContactCreationSuccess() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");

        assertEquals("11111", contact.getContactID());
        assertEquals("Bill", contact.getFirstName());
        assertEquals("Gates", contact.getLastName());
        assertEquals("4226397821", contact.getPhoneNum());
        assertEquals("83 Money Rd", contact.getAddress());
    }
// tests that a contact ID longer than 10 char throws exception
    @Test(expected = IllegalArgumentException.class)
    public void testContactIDTooLong() {
        new Contact("12345678901", "Bill", "Gates", "4226397821", "83 Money Rd");
    }
// tests that first name longer than 10 char throws exception
    @Test(expected = IllegalArgumentException.class)
    public void testFirstNameTooLong() {
        new Contact("11111", "LongFirstName", "Gates", "4226397821", "83 Money Rd");
    }
// tests that last name longer than 10 char throws exception
    @Test(expected = IllegalArgumentException.class)
    public void testLastNameTooLong() {
        new Contact("11111", "Bill", "LongLastName", "4226397821", "83 Money Rd");
    }
// test that invalid phone number format throws exception
    @Test(expected = IllegalArgumentException.class)
    public void testPhoneInvalid() {
        new Contact("11111", "Bill", "Gates", "1234", "83 Money Rd");
    }
// tests that address longer than 30 char throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testAddressTooLong() {
        new Contact("11111", "Bill", "Gates", "4226397821",
                "1234567890123456789012345678901");
    }
// tests all setters
    @Test
    public void testSettersWork() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");

        contact.setFirstName("Fredrick");
        contact.setLastName("Kreuger");
        contact.setPhoneNum("5566668736");
        contact.setAddress("456 Elm St");

        assertEquals("Fredrick", contact.getFirstName());
        assertEquals("Kreuger", contact.getLastName());
        assertEquals("5566668736", contact.getPhoneNum());
        assertEquals("456 Elm St", contact.getAddress());
    }
// tests that an invalid phone number throws exception
    @Test(expected = IllegalArgumentException.class)
    public void testSetInvalidPhone() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        contact.setPhoneNum("123");
    }
}