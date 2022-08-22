package Lex_Introduction_To_Java;
import java.util.Scanner;
public class a_016_print_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Day = ");
		int day = sc.nextInt();
		System.out.print("Month = ");
		int month = sc.nextInt();
		System.out.print("Year = ");
		int year = sc.nextInt();

		if(day <= 31 && month <=12 && year <= 100)
		{
			if(year < 100)
			{
				if(month == 2)
				{
					if(day<=29)
					{
						System.out.println("The Date is : " + day+"-"+month+"-20"+year);
					}
					else
					{
						System.out.println("The current month cannot have more than 29 days!");
					}
				}
				if(month == 4 || month == 6 || month == 9 || month == 11)
				{
					if(day<=30)
					{
						System.out.println("The Date is : " + day+"-"+month+"-20"+year);
					}
					else
					{
						System.out.println("The current month cannot have more than 30 days!");
					}
				}
				else
				{
					System.out.println("The Date is : " + day+"-"+month+"-20"+year);
				}
			}
			else
			{
				System.out.println("The Date is : " + day+"-"+month+"-2"+year);
			}
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}


/* Different Conditions for Valid Date
 * 1) February Special Condition
 * 2) Different End day for different month
 * 3) Year == 100
 */
