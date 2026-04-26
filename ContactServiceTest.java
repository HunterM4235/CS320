package contactMain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ContactServiceTest {

    private contactService service;

    @Before
    public void setup() {
        service = new contactService();
    }
// tests adding contact
    @Test
    public void testAddContactSuccess() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        service.addContact(contact);

        assertEquals("Bill", service.getContact("11111").getFirstName());
    }
// test for duplicate contact ID
    @Test(expected = IllegalArgumentException.class)
    public void testAddDuplicateContactID() {
        Contact c1 = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        Contact c2 = new Contact("11111", "Fred", "Smith", "5566668736", "456 Elm St");

        service.addContact(c1);
        service.addContact(c2);
    }
// tests contact deletion
    @Test
    public void testDeleteContactSuccess() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        service.addContact(contact);

        service.deleteContact("11111");
    }
// test that deleting a non-existing contact throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testDeleteContactNotFound() {
        service.deleteContact("99999");
    }
// tests first name update
    @Test
    public void testUpdateFirstNameSuccess() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        service.addContact(contact);

        service.updateFirstName("11111", "Fredrick");

        assertEquals("Fredrick", service.getContact("11111").getFirstName());
    }
// tests last name update
    @Test
    public void testUpdateLastNameSuccess() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        service.addContact(contact);

        service.updateLastName("11111", "Kreuger");

        assertEquals("Kreuger", service.getContact("11111").getLastName());
    }
// tests phone number update
    @Test
    public void testUpdatePhoneNumSuccess() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        service.addContact(contact);

        service.updatePhoneNum("11111", "5566668736");

        assertEquals("5566668736", service.getContact("11111").getPhoneNum());
    }
// tests address update
    @Test
    public void testUpdateAddressSuccess() {
        Contact contact = new Contact("11111", "Bill", "Gates", "4226397821", "83 Money Rd");
        service.addContact(contact);

        service.updateAddress("11111", "456 Elm St");

        assertEquals("456 Elm St", service.getContact("11111").getAddress());
    }
// tests that updating a non-existing contact throws an exception
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateNonExistentContact() {
        service.updateFirstName("99999", "Test");
    }
}