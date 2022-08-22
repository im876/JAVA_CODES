package Lex_Introduction_To_Java;

import java.util.*;
public class a_013_food_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.in is a standard input stream
		Scanner sc= new Scanner(System.in);

		int v = 12;
		int nv = 15;
		char input;
		int delivery_charge = 0;
		int total_cost = 0;
		int quantity;

		System.out.println("Hi, welcome to Hotel");
		System.out.print("Enter 'v' for veg and 'n' for non veg: ");
		input = sc.next().charAt(0);
		if(input == 'v' || input == 'V' || input == 'n' || input == 'N')
		{
			System.out.print("Very well you have selected ");
			if(input == 'v' || input == 'V')
			{
				System.out.println("veg");
			}
			else 
			{
				System.out.println("non veg");
			}
			System.out.print("Please Enter The Quantity You Would Like To Order: ");
			quantity = sc.nextInt();
			if(quantity>0)
			{
				switch(input)
				{
				case 'v':
				case 'V': total_cost = quantity * v;
					System.out.println(total_cost);
					break;
				case 'n':
				case 'N': total_cost = quantity * nv;
				}
			}
			else
			{
				System.out.println("Better Luck Next Time");
			}
		}
		else
		{
			System.out.println("Better Luck Next Time");
		}

	}

}

/*Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
 * A vegetarian combo costs $12 per plate.
 * A non-vegetarian combo costs $15 per plate. 
 * Apart from the cost per plate of food, customers are also charged for home delivery;
 * based on the distance in kms from the restaurant to the delivery point. 
 * 
 * The delivery charges are as mentioned below:
 * first 3 km : $0
 * next 3 km : $1
 * remaining km : $2
 * 
 * 
 * Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.
 * The below information must be used to check the validity of the data provided by the customer: 
 * 
 * Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
 * Distance in kms must be greater than 0.
 * Quantity ordered should be minimum 1.
 * If any of the input is invalid, the bill amount should be displayed as -1.
 */