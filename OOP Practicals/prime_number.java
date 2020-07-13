package OOPS_PRAC_1;
import java.util.Scanner;
public class prime_number 
{
	public static void main(String[]args)
	{
		int i,j,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number range to check for prime number:");
		num=s.nextInt();
		int count=0;
		for(i=num;i>1;i--)
		{
			for(j=i-1;j>1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if (count==0)
			{
				System.out.println(i);
			}
			else
				count=0;
		}
	}
}

