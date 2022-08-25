package day7.banking;

public class Pan extends Aadhar {

	static int no;
	
	static{
		
		no = 40;
	}	
	
	String panNo;
	
	public Pan(String name, String dob) {
		
		super(name, dob);
		this.panNo = name.substring(0, 4).toUpperCase() + dob.substring(0, 2) + ++no;
	}	
	
}

/*
 * 1. Aadhar is available
 * 2. Aadhar is not available
 * 
 */
