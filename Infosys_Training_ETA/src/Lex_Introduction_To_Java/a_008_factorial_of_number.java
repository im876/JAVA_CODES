package Lex_Introduction_To_Java;

public class a_008_factorial_of_number 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		byte a = 7;
		int result = a;
		for(int i = a; i>=2; i--)
		{
			int temp = i-1;
			result = result * temp;
			System.out.println(i);
			System.out.println(result);
			System.out.println(" ");
		}
		System.out.println(result);
	}

}
