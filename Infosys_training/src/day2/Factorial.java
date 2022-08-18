package day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 7;
		int result = i;
		for (int j = i ; j>=2 ; j--)
		{
		   int temp = j-1;	
		   result = result * temp;
		   
		   //System.out.println("j "+j);
		   //System.out.println(" ");
		   //System.out.println("temp "+temp);
		   //System.out.println(temp);
		   //System.out.println(" ");
		   //System.out.println("result "+result);
		   //System.out.println(result);
		   //System.out.println(" ");
		}
		
		System.out.println(result);
	}

}
