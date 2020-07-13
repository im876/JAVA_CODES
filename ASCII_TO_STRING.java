/*the following code is to convert ASCII to string
 * the code has been written by ISHAN MODI(SE018)
 */
public class ASCII_TO_STRING 
{
    public static void main(String args[])
    {
        int a[] = {65, 120, 98, 75, 115};
        String str =null;
        for(int i: a)
        {
            str = Character.toString((char)i);
            System.out.println(str);
        }
    }
}



