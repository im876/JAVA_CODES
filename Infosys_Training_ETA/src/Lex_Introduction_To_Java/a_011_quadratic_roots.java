package Lex_Introduction_To_Java;

public class a_011_quadratic_roots 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		byte a = 1;
		byte b = 4;
		byte c = 6;
		int discriminant = (b*b)-(4*a*c);
		if(discriminant == 0)
			System.out.println("Roots are equal and value is "+(-b + discriminant)/2*a);
		else if(discriminant > 0)
			System.out.println("Roots are unequal and values are "+(-b + discriminant)/2*a + " and " + (-b - discriminant)/2*a);
		else
			System.out.println("The equation has no real root");
	}

}
/*
Quadratic equation is an equation with degree 2 in the form of 
ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

+) Find the discriminant value using the formula given below.
discriminant = b^2 - 4ac

+) If the discriminant is 0, the values of both the roots will be same. 
Display the value of the root.

+) If the discriminant is greater than 0, 
the roots will be unequal real roots. Display the values of both the roots.

+) If the discriminant is less than 0, there will be no real roots. 
Display the message "The equation has no real root"


+) Use the formula given below to find the roots of a quadratic equation.
x = (-b ± discriminant)/2a

*/