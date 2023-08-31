package orders;

public class Address {

	int addressID;
	String street;
	String city;
	String state;
	String postalCode;

	public Address() {

	}

	public Address(int addressID, String street, String city, String state, String postalCode) {

		this.addressID = addressID;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public int getAddressID() {
		return addressID;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return street + " ,   " + city + " ,  " + state + " ,   " + "-" + postalCode;
	}

}
