package Lex_Introduction_To_Java;

public class a_009_geometric_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IP = 7;
		for (int i = 0; i<IP; i++)
		{
			System.out.print((int)Math.pow(2, i));
			if(i<IP-1)
			{
				System.out.print(", ");
			}
		}
	}

}


/*Implement a program to display the 
 * geometric sequence as given below for a given value n, 
 * where n is the number of elements in the sequence.
 

sample input : 7
sample output : 1, 2, 4, 8, 16, 32, 64
*/