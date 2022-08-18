package day3;
import java.util.Scanner;  
public class Infosys {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		
		//creating three objects
		Employee IM = new Employee();
		IM.EmpID = 101;
		IM.Name = "Ishan Modi";
		IM.Address = "Pune";
		IM.dob = "20.05.01";
		IM.blood_grp = "A+";
		
		Employee IS = new Employee();
		IS.EmpID = 102;
		IS.Name = "Ishan Srivastava";
		IS.Address = "Pune";
		IS.dob = "06.01.00";
		IS.blood_grp = "AB+";
		
		Employee IP = new Employee();
		IP.EmpID = 103;
		IP.Name = "Isha Pathak";
		IP.Address = "Pune";
		IP.dob = "23.02.01";
		IP.blood_grp = "B+";
		
		//testing parameterized constructor
		Employee ishita = new Employee("Ishita");
		
		//printing values of object IM
		System.out.println(" ");
		System.out.println("Emp ID : "+IM.EmpID);
		System.out.println("Name : "+IM.Name);
		System.out.println("Address : "+IM.Address);
		System.out.println("DOB : "+IM.dob);
		System.out.println("Blood Group : "+IM.blood_grp);
		
		
		/*System.out.print("Enter Employee Number - ");  
		int search= sc.nextInt();  
		
		switch(search)
		{
		case 101:
			System.out.println("Emp ID : "+IM.EmpID);
			System.out.println("Name : "+IM.Name);
			System.out.println("Address : "+IM.Address);
			System.out.println("DOB : "+IM.dob);
			System.out.println("Blood Group : "+IM.blood_grp);
			System.out.println(" ");
			
			System.out.println(IM);
			break;
		case 102:
			System.out.println("Emp ID : "+IS.EmpID);
			System.out.println("Name : "+IS.Name);
			System.out.println("Address : "+IS.Address);
			System.out.println("DOB : "+IS.dob);
			System.out.println("Blood Group : "+IS.blood_grp);
			System.out.println(" ");
			break;
		case 103:
			System.out.println("Emp ID : "+IP.EmpID);
			System.out.println("Name : "+IP.Name);
			System.out.println("Address : "+IP.Address);
			System.out.println("DOB : "+IP.dob);
			System.out.println("Blood Group : "+IP.blood_grp);
			System.out.println(" ");
			break;
		default :
			System.out.println("Enter Valid Data : ");
		} */
		
		
	}

}


class Employee
{
	int EmpID;
	String Name;
	String Address;
	String dob;
	String blood_grp;
	
	//constructor - Default or non parameterized
	Employee()
	{
		System.out.println("Welcome to Infosys");
	}
	
	//constructor - Parameterized
	Employee(String name)
	{
		System.out.println("Hi");
		System.out.println("Welcome "+name);
	}
}