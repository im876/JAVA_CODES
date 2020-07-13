//written by ISHAN MODI(SE018
public class try_catch 
{
  public static void main(String[ ] args) 
  {
    try 
    {
      int[] n = {1, 2, 3};
      System.out.println(n[10]);
    } 
    catch (Exception e) 
    {
      System.out.println("Something went wrong.");
    }
  }
}

