/*the code is to input matrix from user and convert it to
 * lower triangluar matrix.
 *the code has been written by ishan modi
 */
import java.util.Scanner;
public class lower_triangular_matrix 
{
	public static void main(String args[])
	{
		//this section of code is to input matrix from user
		int p, q,i,j;
		boolean flag=true;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        p = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        q = s.nextInt();
        int a[][] = new int[p][q];
        System.out.println("Enter all the elements of first matrix:");
        for ( i = 0; i < p; i++) 
        {
            for (j = 0; j < q; j++) 
            {
                a[i][j] = s.nextInt();
            }
        }
        
        //this section is to convert matrix to lower triangular
        if(p!=q)
		{
			System.out.println("THE matrix IS NOT ELIGIBLE");
		}
		else
		{
			 System.out.println("Lower triangular matrix: ");    
             for( i = 0; i < p; i++)
             {    
                 for(j = 0; j < q; j++)
                 {    
                   if(j > i)    
                     System.out.print("0 ");    
                   else    
                     System.out.print(a[i][j] + " ");    
               }    
               System.out.println();    
           }    
		}
	}
}
