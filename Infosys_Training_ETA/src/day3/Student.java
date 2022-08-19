package day3;

public class Student {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		System.out.println("Sum of 10 and 20: " + calc.add(10, 20));
		
		int b = calc.add(25, 68);
		
		System.out.println("Sum of 25 and 68: " + b);
		
		System.out.println("Reverse of 4578: " + calc.reverse(4578));
		
		if(calc.palindrome(121))
			System.out.println("121 is Palindrome");
		else
			System.out.println("121 is not a Palindrome");

	}

}

class Calculator{
	
	int add(double a, double b){
		
		//System.out.println("Sum: " + (a+b));
		return (int)(a+b);
	}
	
	int reverse(int n) {
		
		int rev = 0;
		
		while(n!=0) {
			
			rev = rev*10 + n%10;
			n /= 10;
		}
		
		return rev;
	}
	
	boolean palindrome(int a) {
		
		if(a == reverse(a))
			return true;
		else
			return false;
	}
}
