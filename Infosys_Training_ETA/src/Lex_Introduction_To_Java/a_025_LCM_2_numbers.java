package Lex_Introduction_To_Java;

public class a_025_LCM_2_numbers {

	public static void main(String[] args)    
	{
		int num1 = 7;
		int num2 = 9;
		int lcm = (num1 > num2) ? num1 : num2;
		// Always true
		while(true) 
		{
			if( lcm % num1 == 0 && lcm % num2 == 0 ) 
			{
				System.out.printf("The LCM of "+num1+" and "+num2+" is "+lcm);
				break;
			}
			++lcm;
		}
	}  
}  