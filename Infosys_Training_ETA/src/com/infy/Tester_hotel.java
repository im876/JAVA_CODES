package com.infy;

/*public class Customer {

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
		
		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";

		// Displaying the customer details
		customer.displayCustomerDetails();
		// Move the above statement immediately after the object creation
		// statement and observe the output

	}

}
*/

class Customer 
{
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customer() 
	{
		System.out.println("Parameterless constructor called");
	}
	public Customer(String customerId, String customerName, long contactNumber,
			String address) 
	{
		// this() is used to invoke the constructor of the current class
		// Since no parameters are specified, parameterless constructor will be invoked
		this();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public void displayCustomerName() 
	{
		System.out.println("Customer Name : " + customerName);
	}
	public void displayCustomerDetails() 
	{
        System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		this.displayCustomerName();
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
	}
}


class bill
{
	public int orderID;
	public String orderedFoods;
	public double totalprice;
	public String status;
	public int unit_price = 20;
	public bill()
	{
		System.out.println("Order Details");
	}
	public bill(int orderID, String orderedFoods ,String status)
	{
		this();
		this.orderID = orderID;
		this.orderedFoods = orderedFoods;
		this.status = status;
	}
	public double totalprice()
	{
		totalprice = unit_price + ((5/100)*unit_price);
		return totalprice;
	}
	public void displayTotal()
	{
		//this();
		System.out.println("Displaying bill details \n***********");
		System.out.println("Order Id : " + orderID);
		System.out.println("Ordered Food : " + orderedFoods);
		System.out.println("Status : " + status);
		System.out.println("Total Bill : " + this.totalprice());
	}
}

public class Tester_hotel 
{

	public static void main(String[] args) 
	{

		// Object creation
		Customer customer = new Customer();
		
		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";
		//customer.displayCustomerName();
		// Displaying the customer details
		customer.displayCustomerDetails();
		// Move the above statement immediately after the object creation
		// statement and observe the output
		
		Customer customer1 = new Customer("C102","Ishan Modi",1234567892,"Pune");
		customer1.displayCustomerDetails();
		
		bill bill1 = new bill(102, "Rice", "Ordered");
		bill1.displayTotal();
	}

}