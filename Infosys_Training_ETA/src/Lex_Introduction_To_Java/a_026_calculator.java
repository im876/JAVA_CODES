package Lex_Introduction_To_Java;

public class a_026_calculator {

	public static void main(String args[]) {
		Tester calculator = new Tester();
		// Invoke the method findAverage of the Calculator class and display the average
		calculator.findAverage(12,8,15);
	}

}

class Tester {

	// Implement your code here
		public void findAverage(double number1, double number2, double number3)
		{
			double average = (number1+number2+number3)/3;
			System.out.println(Math.round(average*100.0)/100.0);
		}
	
}