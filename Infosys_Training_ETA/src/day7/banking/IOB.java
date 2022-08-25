package day7.banking;

public class IOB extends RBI {

	static int code = 2870;
	
	static {
		
		name = "Indian Overseas Bank";
	}

	public IOB(String branch, long contactNo, int doorNo, String street, String city, String state,
			int pincode) {
		super(branch, contactNo, doorNo, street, city, state, pincode);
		
		ifscCode = "IOB0A000" + ++code;
	}
	
	
	
}

