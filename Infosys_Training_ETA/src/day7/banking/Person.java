package day7.banking;

public class Person {

	String name;
	String dob;
	long accNo;	
	Aadhar aadharNo;
	Pan panNo;
	
	public Person(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;		
	}
	
	void applyAadhar() {
		
		aadharNo = new Aadhar(name, dob);
	}
	
	void applyPan() {
		
		panNo = new Pan(name, dob); 	
	}
	
	void openAccount(SBI bank) {
		
		accNo = bank.generateAccount(this);
	}
	
	
	
	
}
