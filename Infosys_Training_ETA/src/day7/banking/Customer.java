package day7.banking;

public class Customer {
	
	static long accNo = 10003020;
	
	String name;
	long aadharNo;
	String panNo;
	long accountNumber;
	double balance;
	
	public Customer(String name, long aadharNo, String panNo, SBI bank) {
		
		this.name = name;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		
		this.accountNumber = Long.valueOf(bank.ifscCode.substring(8) + ++accNo);
	}
	
	void deposit(double amount) {
		
		this.balance += amount;
	}
	
	
	
	
}
