package Lex_Introduction_To_Java;


public class a_018_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 545;
		int sum = 0;
		int temp = a;
		while(a>0)
		{
			int r=a%10;  //getting remainder  
			sum=(sum*10)+r;    
			a=a/10;   
			System.out.println("sum : "+ sum);
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");	
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
