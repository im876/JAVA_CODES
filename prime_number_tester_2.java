/* this is a java code to check whether a number is prime number or not
 * What is a prime number?
 * A number divisible by itself & 1
 * NOTE: 1 is not a prime number
 * 
 * the code has been written by Ishan Modi
 */

import java.util.Scanner;  
  
public class prime_number_tester_2 
{  
   public static void main(String[] args) 
   {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) 
       {  
           System.out.println(n + " is a prime number");  
       } 
       else 
       {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n)
   {  
       if (n <= 1) 
       {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++)
       {  
           if (n % i == 0) 
           {  
               return false;  
           }  
       }  
       return true;  
   }  
}  