package OOPS_PRAC_1;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[]args)
	{
		int i,a,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number whose factorial is to be found:");
		a=s.nextInt();
		for(i=a;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial is :"+fact);
	}
}
