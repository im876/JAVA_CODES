/*the code is to transpose a matrix
 *the code hasbeen written by ishan modi
 */
public class transpose_matrix
{
	public static void main(String args[])
	{
		int i,j;
		int original[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int transpose[][]=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				transpose[i][j]=original[j][i];
			}
		}
		System.out.println("ORIGINAL MATRIX:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(original[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("TRANSPOSE MATRIX:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
}