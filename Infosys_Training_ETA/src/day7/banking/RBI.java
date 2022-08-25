package day7.banking;

public class RBI {

	static String name;
	String ifscCode;
	String branch;
	long contactNo;
	Address contact;
	
	static {
		name = "Reserve Bank of India";
	}

	public RBI(String branch, long contactNo, int doorNo, String street, String city, String state, int pincode) {
				
		this.branch = branch;
		this.contactNo = contactNo;
		this.contact = new Address(doorNo, street, city, state, pincode);
	}
	
	
	
	
}
