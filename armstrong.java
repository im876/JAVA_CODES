import java.util.Scanner;

/*the following code is to check a number whether it is armstrong 
 * or not.
 * The code has been written by Ishan Modi

Given Below are some examples:
Input : 153
Output : Yes
153 is an Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153

Input : 120
Output : No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

Input : 1253
Output : No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723

Input : 1634
Output : Yes
1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634*/

public class armstrong 
{
	public static void main(String args[])
	{
		int num,i,temp=0,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check for whether it is armstrong or not:");
		num = s.nextInt();
		c=num;
		while(num>0)
		{
			i=num%10;
			num=num/10;
			temp=temp+(i*i*i);
		}
		if(temp==c)
		{
			System.out.println("AN ARMSTRONG NUMBER");
		}
		else
		{
			System.out.println("NOT AN ARMSTRONG NUMBER");
		}
	}
}
