/*the code is to check whether matrix is equal or not by user input
 *the code has been written by ishan modi
 */
import java.util.Scanner;
public class check_identity_matrices_2 
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
        
        //this section of code is to check for identity matrix
        if(p!=q)
		{
			System.out.println("THE matrix IS NOT ELIGIBLE");
		}
		else
		{
			for(i = 0; i < p; i++)
			{    
                for(j = 0; j < q; j++)
                {    
                  if(i==j && a[i][j]!=1)
                  {    
                      flag = false;    
                      break;    
                  }    
                  if(i!=j && a[i][j]!=0)
                  {    
                      flag = false;    
                      break;    
                  }    
                }    
			}
			if(flag)    
	                System.out.println("Given matrix is an identity matrix");    
	        else    
	                System.out.println("Given matrix is not an identity matrix");   
		}
	}
}
