package NPTEL_WEEK01;

import java.util.Scanner;  
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
        int z = s.nextInt();
        int result = 0;
        if(x >= y && x >= z)
        {
            result=x;
        }
        else if(y >= z)
        {
            result=y;
        }
        else
        {
            result=z;
        }
        System.out.println(result);
	}
}