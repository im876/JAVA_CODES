package day7.banking;

public class Aadhar {
	
	static long no;
	
	static{
		no = 307000005080l;
	}
	
	String name;
	String dob;
	long aadharNo;
	
	public Aadhar(String name, String dob) {
		
		this.name = name;
		this.dob = dob;
		this.aadharNo = ++no;
	}
	
	
}
