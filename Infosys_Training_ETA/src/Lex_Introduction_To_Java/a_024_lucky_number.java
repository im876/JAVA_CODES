package Lex_Introduction_To_Java;

public class a_024_lucky_number 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 1623;
		int length = (int)((Integer.toString(a)).length());
		//System.out.println(2%2);
		int sum = 0;
		for(int i = 1; i<=length; i++)
		{
			//System.out.println("i "+i);
			int r = a%10;
			//System.out.println("r " +r);
			if(i%2!=0)
			{
				sum = sum + (r*r);
				//System.out.println("Sum "+sum);
			}
			a = a/10;
			//System.out.println(" ");
		}
		if(sum% 9 == 0)
		{
			System.out.println("Lucky");
		}
		else
		{
			System.out.println("Not Lucky");
		}
	}

}