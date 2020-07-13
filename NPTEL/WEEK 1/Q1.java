package NPTEL_WEEK01;

import java.util.Scanner;  
public class Q1 
{
	public static void main(String[] args) 
	{
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=s.nextInt();    
		Scanner s1 = new Scanner(System.in); 
        double radius= s1.nextDouble();
        double perimeter;
        double area;
        if(radius<=0)
        {
        	System.out.println("please enter non zero positive number ");
        }
        else
        {
        	perimeter = 2 * Math.PI * radius;
        	area = Math.PI * radius * radius;
        	System.out.println(perimeter);
        	System.out.println(area);
        }
	}
}