package day7.banking;

public class SBI extends RBI {
	
	static int code = 6070;
	
	Customer customers[];
	int count = 0;
	
	static {
		name = "State Bank of India";
	}

	public SBI(String branch, long contactNo, int doorNo, String street, String city, String state,
			int pincode) {
		super(branch, contactNo, doorNo, street, city, state, pincode);
		
		ifscCode = "SBI0I000" + ++code;
		customers = new Customer[10];
	}
	
	long generateAccount(Person customer){
		
		customers[count++] = new Customer(customer.name, customer.panNo.aadharNo, customer.panNo.panNo, this);
		
		customers[count-1].deposit(500);
		
		return customers[count-1].accountNumber;
	}
}
