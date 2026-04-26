package contactMain;

import java.util.HashMap;
import java.util.Map;

public class contactService {

	// stores contact using ContactID for fast lookup
    private Map<String, Contact> contacts = new HashMap<>();

    // adds new contact if ID does not exists
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact ID already exists!");
        }
        contacts.put(contact.getContactID(), contact);
    }

    // deletes contact if ID is found
    public void deleteContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found!");
        }
        contacts.remove(contactID);
    }

    //retrieves a contact if ID exists, otherwise throws exception
    public Contact getContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact ID not found!");
        }
        return contacts.get(contactID);
    }

    // updates first name of a contact
    public void updateFirstName(String contactID, String newFirstName) {
        Contact contact = getContact(contactID);
        contact.setFirstName(newFirstName);
    }

    // updates last name of a contact
    public void updateLastName(String contactID, String newLastName) {
        Contact contact = getContact(contactID);
        contact.setLastName(newLastName);
    }

    // updates phone number of a contact
    public void updatePhoneNum(String contactID, String newPhoneNum) {
        Contact contact = getContact(contactID);
        contact.setPhoneNum(newPhoneNum);
    }

    // updates address of a contact
    public void updateAddress(String contactID, String newAddress) {
        Contact contact = getContact(contactID);
        contact.setAddress(newAddress);
    }
}