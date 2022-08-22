package Lex_Introduction_To_Java;

import java.util.Scanner;

public class a_014_Bank {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int acc_num;
		int salary;
		int acc_bal;
		String loan;
		int loan_amt_exp;
		int EMI;
		
		System.out.println("Welcome to HDFC Bank!!");
		System.out.println(" ");
		System.out.print("Enter Your Account Number: ");
		acc_num = sc.nextInt();
		if((acc_num/1000 == 1) && (String.valueOf(acc_num).length() == 4))
		{
			System.out.print("Enter Your Salary: ");
			salary = sc.nextInt();
			System.out.print("Enter Your Account Balance: ");
			acc_bal = sc.nextInt();
			if(acc_bal >= 1000)
			{
				System.out.print("Enter the type of loan you are looking for: ");
				loan = sc.next();
				System.out.println("What is the loan amount you expect: ");
				loan_amt_exp = sc.nextInt();
				System.out.println("What is the number of EMI you are looking for: ");
				EMI = sc.nextInt();
				System.out.println("Very Well Let Me check internally");
				for(int i = 1; i<=10; i++)
				{
					System.out.println(".");
				}
				switch(loan)
				{
				case "car":
				case "Car":
				case "CAR":if(salary > 25000)
						   {
								System.out.println("Eligible Loan Amount : 500000");
								System.out.println("Number of EMI eligible : 36");
				           }
						   else
						   {
							   System.out.println("Not Eligible Currently!!");
						   }
						   break;
				case "house":
				case "House":
				case "HOUSE":if(salary > 50000)
						   {
								System.out.println("Eligible Loan Amount : 6000000");
								System.out.println("Number of EMI eligible : 60");
				           }
						   else
						   {
							   System.out.println("Not Eligible Currently!!");
						   }
						   break;
				case "business":
				case "Business":
				case "BUSINESS":if(salary > 75000)
						   {
								System.out.println("Eligible Loan Amount : 7500000");
								System.out.println("Number of EMI eligible : 84");
				           }
						   else
						   {
							   System.out.println("Not Eligible Currently!!");
						   }
						   break;
				}
					
			}
			else
			{
				System.out.println("Your balance is low, you cannot apply for loan");
				System.out.println("Thank You Visit Us Again!!");
			}
		}
		else
		{
			System.out.println("You input do not match out criteria.");
			System.out.println("Thank You Visit Us Again!!");
		}
		
		//System.out.println(String.valueOf(a).length());
	}

}


