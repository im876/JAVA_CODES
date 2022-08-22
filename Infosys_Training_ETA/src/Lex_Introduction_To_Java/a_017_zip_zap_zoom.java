package Lex_Introduction_To_Java;

import java.util.Scanner;

public class a_017_zip_zap_zoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		if(a%3 == 0 && a%5 ==0)
		{
			System.out.println("Zoom");
		}
		else if(a%5 == 0)
		{
			System.out.println("Zap");
		}
		else if(a%3 == 0)
		{
			System.out.println("Zip");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
