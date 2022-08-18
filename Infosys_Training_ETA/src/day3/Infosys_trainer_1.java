package day3;

public class Infosys_trainer_1 {	

	public static void main(String[] args) {

		Employee2 dk = new Employee2();
		
		dk.empId = 101;
		dk.name = "Dineshkumar";
		dk.address = "Chennai";
		dk.dob = "06 Feb 1991";
		dk.bloodGr = "A1B";
		
		System.out.println("EmpId: " + dk.empId);
		System.out.println("Name: " + dk.name);
		System.out.println("Address: " + dk.address);
		System.out.println("DOB: " + dk.dob);
		System.out.println("BloodGr: " + dk.bloodGr);
		System.out.println();
						
		Employee2 anjali;
		
		anjali = new Employee2();
		
		System.out.println(anjali.empId);
		
		System.out.println();
		
		Employee2 nirmal = new Employee2("Nirmal");
		System.out.println(nirmal.name);
		
		Employee2 vidya = new Employee2(103, "VidyaSree", "Hydrebad", "01-02-2001", "B");

		System.out.println("\nEmpId: " + vidya.empId);
		System.out.println("Name: " + vidya.name);
		System.out.println("Address: " + vidya.address);
		System.out.println("DOB: " + vidya.dob);
		System.out.println("BloodGr: " + vidya.bloodGr);
		System.out.println("Experience: " + vidya.experience);
	}

}

class Employee2{
	
	//Instance Variable
	
	int empId;
	String name;
	String address;
	String dob;
	String bloodGr;
	double experience;
	
	//Constructor - Default or Non-Parameterized
	Employee2(){
		System.out.println("Welcome To Infosys");
	}
	
	//Constructor - Parameterize
	Employee2(String n){
		
		System.out.println("Welcome");
		System.out.println("Hi! " + n);		
	}
	
	Employee2(int id, String n, String a, String d, String b){
		
		empId = id;
		name = n;
		address = a;
		dob = d;
		bloodGr = b;
	}
}


