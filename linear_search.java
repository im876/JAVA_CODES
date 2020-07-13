/*the following code is for linear search
 * what is linear search?
 * Linear search is a very basic and simple search algorithm. 
 * In Linear search, we search an element or value in a given 
 * array by traversing the array from the starting, till the 
 * desired element or value is found.
 * 
 * Algorithm:
Step 1: Traverse the array
Step 2: Match the key element with array element
Step 3: If key element is found, return the index position 
of the array element
Step 4: If key element is not found, return -1

THE CODE HAS BEEN WRITTEN BY ISHAN MODI
 */
import java.util.Scanner;  
public class linear_search   
{  
  public static void main(String args[])  
  {  
    int c, n, search, array[];  
    Scanner in = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = in.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (c = 0; c < n; c++)  
      array[c] = in.nextInt();  
   
    System.out.println("Enter value to find");  
    search = in.nextInt();  
   
    for (c = 0; c < n; c++)  
    {  
      if (array[c] == search)     /* Searching element is present */  
      {  
         System.out.println(search + " is present at location " + (c + 1) + ".");  
          break;  
      }  
   }  
   if (c == n)  /* Element to search isn't present */  
      System.out.println(search + " isn't present in array.");  
  }  
}  