import java.util.Scanner;

/*THE FOLLOWING CODE IS TO CHECK A NUMBER FOR WHETHER IT IS A 
 * PALINDROME NUMBER OR NOT
 * 
 * WHAT IS A PALINDROME NUMBER?
 * A NUMBER WHICH IS THE SAME EVEN WHEN IT IS REVERSED IS A 
 * PALINDROME NUMBER
 * EG: 323, 5445
 * 
 * THE FOLLOWING CODE HAS BEEN WRITTEN BY ISHAN MODI
 */
public class PALINDROME 
{
	public static void main(String args[])
	{
		int r,sum=0;
		Scanner s = new Scanner(System.in);  
	    System.out.print("Enter a number : ");  
	    int n = s.nextInt();
	    int temp=n;
	    while(n>0)
	    {    
	    	r=n%10;  //getting remainder  
	    	sum=(sum*10)+r;    
	    	n=n/10;    
	    }  
	    if(temp==sum)
	    {
	    	System.out.println("A PALINDROME NUMBER");
	    }
	    else
	    {
	    	System.out.println("NOT A PALINDROME NUMBER");
	    }
	}
}
