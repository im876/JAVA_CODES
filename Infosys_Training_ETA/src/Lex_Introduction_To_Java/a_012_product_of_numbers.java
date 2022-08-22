package Lex_Introduction_To_Java;

public class a_012_product_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 3;
		byte b = 7;
		byte c = 8;
		if(a!= 7 && b!= 7 && c!=7)
			System.out.println(a*b*c);
		else if(a==7)
			System.out.println(b*c);
		else if(b==7)
			System.out.println(c);
		else
			System.out.println("-1");

	}

}


/*Implement a program to calculate the product of 
 * three positive integer values. 
 * However, if one of the integers is 7, 
 * consider only the values to the right of 7 for calculation. 
 * If 7 is the last integer, then display -1.
 * Note: Only one of the three values can be 7.
 * 1,5,3 = 15
 * 3,7,8 = 8
 * 7,2,9 = 18
 * 2,6,7 = -1
 */
 