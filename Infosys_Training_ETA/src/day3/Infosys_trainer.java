package day3;

public class Infosys_trainer {

	public static void main(String[] args) {

		Employee1 dk = new Employee1();
		
		dk.empId = 101;
		dk.name = "Dineshkumar";
		dk.address = "Chennai";
		dk.dob = "06-02-1991";
		dk.bloodGr = "A1B";
		
		System.out.println("EmpId: " + dk.empId);
		System.out.println("Name: " + dk.name);
		System.out.println("Address: " + dk.address);
		System.out.println("DOB: " + dk.dob);
		System.out.println("BloodGr: " + dk.bloodGr);

	}

}

class Employee1{
	
	//Instance Variable
	
	int empId;
	String name;
	String address;
	String dob;
	String bloodGr;
}


