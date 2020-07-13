import java.util.Scanner;
public class corona_special
{
	public static void main(String args[])
	{
		String s1;
		 String s2 = new String("CORONA GO"); 
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter CORONA GO for special effects:"); 
 		s1 = sc.nextLine();
 		if(s1.equals(s2)==true)
 		{
 			for(int i=0 ;i<100 ;i++ )
 			{
 				System.out.println("CORONA GO");
 				System.out.println("GO CORONA");
 				System.out.println();
 			}
 		}
 		else
 		{
 			System.out.println("EK CHEEZ BOLI THI THEEK SE KAR DO");
 		}
	}
}