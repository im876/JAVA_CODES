package Lex_Introduction_To_Java;

public class a_006_largest_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a = 4;
		short b = 1;
		short c = 4;
		if(a>b && a>c)
			System.out.println("a is greatest");
		else if(b>a && b>c)
			System.out.println("b is greatest");
		else if(c>a && c>b)
			System.out.println("c is greatest");
		else if(a==b && a>c)
			System.out.println("a and b are greatest");
		else if(b==c && b>a)
			System.out.println("b and c are greatest");
		else
			System.out.println("a and c are greatest");
			
	}

}


//Implement a program to find and display the 
//maximum number out of the given three numbers.