package OOP_PRACS;
import java.util.Scanner;
public class calculator 
{
	public int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	public static void main(String[] args) 
	{
		calculator obj=new calculator();
		double first_no;
		double second_no;
		System.out.println("Enter the first number");
		Scanner in=new Scanner(System.in);
		first_no=in.nextDouble();
		System.out.println("Enter the second number");
		second_no=in.nextDouble();
		int choice;
		do
		{
			System.out.println(" 1.Addition\n 2.Substaction\n 3.Multiplication\n 4.Division\n 5.Factorial");
			System.out.println("Enter the choice");
			int ch=in.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Result is :" +(first_no+second_no));
					break;
			case 2: System.out.println("Result is :" +(first_no-second_no));
					break;
			case 3: System.out.println("Result is :" +(first_no*second_no));
					break;
			case 4: System.out.println("Result is :" +(first_no/second_no));
					break;
			case 5:System.out.println("Enter the no :");
				   int no=in.nextInt();
				   System.out.println("Result is :" + obj.factorial(no));
				   break;
			}
			System.out.println("Do U want to continue 1 or 0?");
			choice=in.nextInt();
		}while(choice==1);
	}
}