package tester;

public class Employee4 {
	private String name;
	private int empId;
	private String city;

	Employee4() {
		this.city = "New York";
	}

	Employee4(String name, int empId) {
		this();
		this.name = name;
		this.empId = empId;
	}

	public static void main(String[] args) {
		Employee4 employee1 = new Employee4("John", 101);
		Employee4 employee2 = new Employee4();

		System.out.println(employee1.name + " " + employee1.empId + " "
				+ employee1.city);
		System.out.println(employee2.name + " " + employee2.empId + " "
				+ employee2.city);
	}
}