package Lex_Introduction_To_Java;

public class a_021_iteration_control_assignment_4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 123;
		int b = 738;
		
		int prod = 1;
		int temp = a;
		while(a>0)
		{
			int r=a%10;  //getting remainder  
		    prod = prod * r;
			a=a/10;   
			System.out.println("r : "+r);
			System.out.println("product : "+ prod);
		}
		prod = prod * temp;
		if(prod == b)
			System.out.println(temp+" is a seed of "+b);
		else
			System.out.println(temp+" is not a seed of "+b);
	}

}
