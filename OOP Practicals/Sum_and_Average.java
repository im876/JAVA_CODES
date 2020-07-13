package OOP_PRACS;
import java.util.Scanner;
public class Sum_and_Average 
{
	public static void main(String[]args)
	{
		float a,c;
		float sum=0;
		float avg=0;
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number of no to be entered");
		a=s.nextFloat();
		for(float i=a;i>0;i--)
		{
			System.out.println("Enter the number");
			c=s1.nextFloat();
			sum=sum+c;
		}
		System.out.println("sum of entered number is :"+sum);
		avg=sum/a;
		System.out.println("average of entered number is :"+avg);
	}
}