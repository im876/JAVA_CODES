package NPTEL_WEEK08;
import java.util.Scanner;
public class sevensegment_display 
{
	public static void main(String[] args)
	{   
		int ch;
		Scanner s=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Enter the choice from 1 to 9 or enter 10 to display all in a single line:");
		    ch=s.nextInt();
			switch(ch)
			{
			case 1: System.out.println("   ");
					System.out.println(" "+" |");
					System.out.println("  "+"|");
					break;
			case 2:	System.out.println(" _ ");
			   		System.out.println(" "+"_|");
			   		System.out.println("|_"+" ");
			   		break;
			case 3: System.out.println(" _ ");
			   		System.out.println(" "+"_|");
			   		System.out.println(" _"+"|");
			   		break;
			case 4: System.out.println("   ");
			   		System.out.println("|_|");
			   		System.out.println("  |");
			   		break;
			case 5: System.out.println(" _ ");
			   		System.out.println("|"+"_ ");
			   		System.out.println(" _"+"|");
			   		break;
			case 6: System.out.println(" _ ");
			   		System.out.println("|"+"_ ");
			   		System.out.println("|_"+"|");
			   		break;
			case 7: System.out.println(" _ ");
			   		System.out.println(" "+" |");
			   		System.out.println("  "+"|");
			   		break;
			case 8: System.out.println(" _ ");
			   		System.out.println("|"+"_|");
			   		System.out.println("|_"+"|");
			   		break;
			case 9: System.out.println(" _ ");
			   		System.out.println("|"+"_|");
			   		System.out.println(" _"+"|");
			   		break;
			case 10:System.out.println("   "+" _ "+" _ "+"   "+" _ "+" _ "+" _ "+" _ "+" _ ");
	   				System.out.println(" "+" |"+" "+"_|"+" "+"_|"+"|_|"+"|"+"_ "+"|"+"_ "+" "+" |"+"|"+"_|"+"|"+"_|");
	   				System.out.println("  "+"|"+"|_"+" "+" _"+"|"+"  |"+" _"+"|"+"|_"+"|"+"  "+"|"+"|_"+"|"+" _"+"|");
	   		break;
			default:System.out.println("enter a number from 1 to 9 plz");
		}
			System.out.println("Do U want to continue 1 or 0?");
			choice=s.nextInt();
		}while(choice==1);
}
}

