package Lex_Introduction_To_Java;

public class a_023_armstrong {
		public static void main(String[] args) {
			// Implement your code here 
			int a = 1635;
			int power = (int)((Integer.toString(a)).length());
			int temp = a;
			int sum = 0;
			while(a>0)
			{
			    int r = a%10;
			    //System.out.println(r);
			    sum = sum + (int)Math.pow(r, power);
			    a = a/10;
			}
			if(sum==temp)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("Not Armstrong");
			}
		}
	}