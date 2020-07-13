/* this is a java code to check whether a number is prime number or not
 * What is a prime number?
 * A number divisible by itself & 1
 * NOTE: 1 is not a prime number
 * 
 * the code has been written by Ishan Modi
 */
public class prime_number_tester
{    
 public static void main(String args[])
 {    
	 int i,m=0,flag=0;      
	 int n=3;//it is the number to be checked    
	 m=n/2;      
	 if(n==0||n==1)
	 {  
		 System.out.println(n+" is not prime number");      
	 }
	 else
	 {  
		 for(i=2;i<=m;i++)
		 {      
			 if(n%i==0)
			 {      
				 System.out.println(n+" is not prime number");      
				 flag=1;      
				 break;      
			 }      
		 }      
		 if(flag==0)  
		 { 
			 System.out.println(n+" is prime number"); 
		 }  
	 }//end of else  
 }    
}   