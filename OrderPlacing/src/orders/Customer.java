package orders;

public class Customer {

	int customerID;
	String name;
	String email;
	String phone;
	String date;
	int addressID;

	public Customer(int customerID, String name, String email, String phone, String date, int addressID) {

		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.date = date;
		this.addressID = addressID;
	}

	public Customer() {

	}

	public int getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getDate() {
		return date;
	}

	public int getAddressID() {
		return addressID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}

}
