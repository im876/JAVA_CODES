package Lex_Introduction_To_Java;

import java.util.Scanner;

public class a_015_exact_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number $1 notes available : ");
		int dollar_1 = sc.nextInt();
		System.out.print("Enter number $5 notes available : ");
		int dollar_5 = sc.nextInt();
		System.out.print("Enter the total amount : ");
		int total = sc.nextInt();
		int amt = dollar_5 * 5 + dollar_1;
		
		if(total > amt)
		{
			System.out.println("-1");
		}
		
		else if(total < amt)
		{
			int no_5_req = total/5;
			int no_1_req = total%5;
			System.out.println("No. of $1 needed : " + no_1_req);
			System.out.println("No. of $5 needed : " + no_5_req);
		}
		
		else
		{
			System.out.println("-1");
		}
	}

}
