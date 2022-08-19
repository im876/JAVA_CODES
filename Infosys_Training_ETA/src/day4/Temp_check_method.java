package day4;

public class Temp_check_method {
	public boolean checkTemp(int temp) {
		if (temp > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Temp_check_method tester = new Temp_check_method();
		if (tester.checkTemp(110)) {
			System.out.println("Data is valid");
		} else {
			System.out.println("Data is invalid");
		}
	}
}