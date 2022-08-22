package Lex_Introduction_To_Java;

public class a_020_divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2250;
		int digits = 0 ;
		int temp = a;
		while(a>0)
		{
			int r = a%10;
			digits = digits + r;
			//System.out.println(r);
			//System.out.println(digits);
			//System.out.println(" ");
			a = a/10;
		}
		if((temp % digits) == 0)
		{
			System.out.println("Divisible");
		}
		else
		{
			System.out.println("not divisible");
		}
	}

}
