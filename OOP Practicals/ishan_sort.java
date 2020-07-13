package OOP_PRACS;
import java.util.Scanner;
class Sort
{
	void sortInterger(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
void sortString(String str[])
{
	String temp;
	for (int i = 0; i < str.length; i++)
	{
		for (int j = i + 1; j < str.length; j++)
		{
			if (str[i].compareTo(str[j]) > 0)
			{
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
	}
	}
}
public class ishan_sort
{
	public static void main(String[] args)
	{
		Sort obj = new Sort();
		Scanner in = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println(" \n\n 1.Sort Integer\n 2.Sort String\n 3.Exit\n");
			System.out.println("Enter the choice");
			ch = in.nextInt();
			switch (ch)
			{
			case 1:System.out.println("Enter the size of Array ");
				   int n = in.nextInt();
				   System.out.println("Enter the Numbers :");
				   int arr[] = new int[n];
				   for (int i = 0; i < n; i++)
					   arr[i] = in.nextInt();
				   obj.sortInterger(arr);
				   System.out.println("Sorted Numbers :");
				   for (int i = 0; i < n; i++)
					   System.out.print(arr[i] + " ");
				   break;
			case 2://String names[] = { "ram", "shyam", "seeta", "geeta", "reeta" };
				   System.out.println("Enter the size of Array ");
				   int n1 = in.nextInt();
				   System.out.println("Enter the Strings :");
				   String arr1[] = new String[n1];
				   for (int i = 0; i < n1; i++)
					   arr1[i] = in.next();
				   obj.sortString(arr1);
				   for (int i = 0; i < arr1.length; i++)
					   System.out.print(arr1[i] + " ");
				   break;
			}
		} while (ch != 3);
	}
}