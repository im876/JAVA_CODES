package day3;

public class Infosys_trainer_2 {	

	public static void main(String[] args) {

		Employee4 dk = new Employee4(101, "Dineshkumar", "Chennai", "06-02-1991","A1B", 50000);						
		
		Employee4 vidya = new Employee4(103, "VidyaSree", "Hydrebad", "01-02-2001", "B", 50000);
		
		dk.printId();
		vidya.printId();
		
		System.out.println("Salary of " + dk.name + " is: " + dk.salary(5));
		
	}

}

class Employee4{
	
	//Instance Variable
	
	int empId;
	String name;
	String address;
	String dob;
	String bloodGr;
	double salary;
	double experience;
	
	//Constructor - Default or Non-Parameterized
	Employee4(){
		
		System.out.println("Welcome To Infosys");
	}
	
	//Constructor - Parameterize
	public Employee4(String name) {
		
		this();
		
		System.out.println("Hi! " + name + "\n");
		this.name = name;
	}

	public Employee4(int empId, String name, String address, String dob, String bloodGr, double salary) {
		
		this(name);
		
		this.empId = empId;
		//this.name = name;
		this.address = address;
		this.dob = dob;
		this.bloodGr = bloodGr;
		this.salary = salary;
		
	}
	
	void printId(){
		
		System.out.println("EmpId: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("DOB: " + dob);
		System.out.println("BloodGr: " + bloodGr);
		System.out.println();
		
	}
	
	double salary(double experience) {
		
		salary = salary + this.bonus(experience)/100 * salary;
		
		return salary;
	}
	
	double bonus(double experience) {
		
		if(experience>=2)
		{
			switch((int)experience) {
				
			case 2:
				return 5;
			case 3:
				return 8;
			default:
				return 10;
			}
		}
		else
			return 0;
	}
	
}


