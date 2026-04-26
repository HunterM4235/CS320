package contactMain;

public class Contact {
	
	//ATTRIBUTES
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	//Constructor to create a new Contact object.
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID!");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name!");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name!");
		}
		if (phoneNum == null || phoneNum.length() != 10 || !phoneNum.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phone number!");
		}
		 if (address == null || address.length() > 30) {
	            throw new IllegalArgumentException("Invalid address");
	        }
		 
		 this.contactID = contactID;
		 this.lastName = lastName;
		 this.firstName = firstName;
		 this.phoneNum = phoneNum;
		 this.address = address;
	}
	//getter contactID
	public String getContactID() {
		return contactID; 
	}
	//getter firstName
	public String getFirstName() {
		return firstName; 
	}
	//setter firstName
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name!");
		}
		this.firstName = firstName;
	}
	
	//getter lastName
	public String getLastName() {
		return lastName;
	}
	//setter lastName
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name!");
		}
		this.lastName = lastName;
	}
	//getter phoneNum
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		if (phoneNum == null || phoneNum.length() != 10 || !phoneNum.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid phone number!");
		}
		this.phoneNum = phoneNum;
	}
	//getter address
	public String getAddress() {
		return address;
	}
	//setter address
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address!");
		}
		this.address = address;
	}

}
