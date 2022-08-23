package com.infy;

public class Customer {

	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;

	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}

}

class food{
	public String foodname;
	public String cuisine;
	public String foodtype;
	public int quantity_available;
	public double unitPrice;
	
	public void displayFoodDetails() {
		System.out.println("Displaying food details \n***************************");
		System.out.println("Food Name : " + foodname);
		System.out.println("Cuisine : " + cuisine);
		System.out.println("foodtype : " + foodtype);
		System.out.println("Quantity Available : " + quantity_available);
		System.out.println("Unit Price : " + unitPrice);
		System.out.println();
	}
}

class Tester_hotel {

	public static void main(String[] args) {

		// Object creation
		Customer customer = new Customer();
		customer.displayCustomerDetails();
		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";

		// Displaying the customer details
		
		// Move the above statement immediately after the object creation
		// statement and observe the output

	}

}