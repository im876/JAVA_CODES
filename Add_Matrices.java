/*the following code is to add two matrices
 * the code has been written by ishan modi
 */
public class Add_Matrices 
{
	public static void main(String args[])
	{
		int a[][]={{2,3,4},{2,4,3},{3,4,5}};//matrix 1 declaration 
		int b[][]={{2,3,4},{2,4,3},{1,2,4}};//matrix 2 declaration
		int c[][]=new int[3][3];//addition matrix
		System.out.println("Addition is:");
		for(int i=0;i<3;i++)//loop for rows
		{
			for(int j=0;j<3;j++)//loop for columns
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();//entering new line
		}
	}
}
