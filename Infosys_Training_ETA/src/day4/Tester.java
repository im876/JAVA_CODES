package day4;

public class Tester {
	public int num1;
	public int num2;

	Tester(int num1, int num2) {
		num1 = num1;
		num2 = num2;
	}

	public static void main(String args[]) {
		Tester tester = new Tester(20, 40);
		System.out.println(tester.num1);
		System.out.println(tester.num2);
	}
}