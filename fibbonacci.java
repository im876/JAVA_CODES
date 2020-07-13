/* this is a java code to print fibbonacci numbers
 * example of fibbonacci numbers: 0,1,1,2,3,5,8,13....and so on
 * the code has been written by Ishan Modi
 */
import java.util.Scanner;
public class fibbonacci 
{
	public static void main(String args[])
	{
		int a=0, b=1, c, i, n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number fo fibbonacci numbers that you want");
		n=s.nextInt();
		System.out.print(a+" "+b);//printing 0 & 1 since they are predefined always
		for(i=2; i<n; i++)//loop starts from 2 since first 2 values are already printed
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
