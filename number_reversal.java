/*THE FOLLOWING CODE IS TO REVERSE A NUMBER
 *THE FOLLOWING CODE HAS BEEN WRITTEN BY ISHAN MODI
 */
import java.util.Scanner;
public class number_reversal 
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
	    System.out.println(sum);
	}
}

/*REVERSE ALGORITHM/EXPLANATION
 * 1)First, the remainder of num divided by 10 is stored in the 
 * variable digit. Now, digit contains the last digit of num, 
 * i.e. 4.
 * 
 * 2)digit is then added to the variable reversed after 
 * multiplying it by 10. Multiplication by 10 adds a new place 
 * in the reversed number. One-th place multiplied by 10 gives 
 * you tenth place, tenth gives you hundredth and so on. In this case, 
 * reversed contains 0 * 10 + 4 = 4.
 * num is then divided by 10 so that now it only contains first 
 * three digits: 123.
 * 
 * 3)After second iteration, digit equals 3, reversed equals 
 * 4 * 10 + 3 = 43 and num = 12
 * 
 * 4)After third iteration, digit equals 2, reversed equals 
 * 43 * 10 + 2 = 432 and num = 1
 * 
 * 5)After fourth iteration, digit equals 1, reversed equals 432 * 10 + 1 = 4321 and num = 0
 * 
 * 6)Now num = 0, so the test expression num != 0 fails and while loop exits. 
 * reversed already contains the reversed number 4321.
 */
