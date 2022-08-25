package day7.banking;

public class Address {
	
	int doorNo;
	String street, city, state;
	static String country;
	int pincode;
	
	static {
		country = "INDIA";
	}

	public Address(int doorNo, String street, String city, String state, int pincode) {
		
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	void printAddress() {
		
		System.out.println(String.join(", ", String.valueOf(doorNo), street, city, state, country, String.valueOf(pincode)));
	}
	
}
