package day4;

public class GandhiSchool {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Student mahesh = new Student(1001, "Mahesh", "10th Standard", 'M', 9876543210l);
		
		Student shreya = new Student(1002, "Shreya", "12th Standard", 'F', 9685475462l);
		
		Student stu1;
		
		stu1 = mahesh;
		
		System.out.println(mahesh + " " + stu1);
		
		System.out.println(mahesh.name + " " + stu1.name);
		
			

	}

}

class Student{
	
	int stuId;
	String name;
	String std;
	char gender;
	long mobile;
	
	Student(int stuId, String name, String std, char gender, long mobile) {
		
		this.stuId = stuId;
		this.name = name;
		this.std = std;
		this.gender = gender;
		this.mobile = mobile;
	}
	
	void printDetails() {
		
		System.out.printf("%-10s%d\n", "StuId:", stuId);
		System.out.printf("%-10s%s\n", "Name", name);
		System.out.printf("%-10s%s\n", "Std", std);
		System.out.printf("%-10s%c\n", "Gender", gender);
		System.out.printf("%-10s%d\n", "Mobile", mobile);
	}
	
	
	
}
