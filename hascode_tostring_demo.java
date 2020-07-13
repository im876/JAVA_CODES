/*the following code is to demonstrate the working of 
 * hasCode() and toString() methods.
 * 
 * code has been written by Ishan Modi
 */

public class hascode_tostring_demo 
{ 
	static int a = 100; 
	int b; 

	hascode_tostring_demo() 
	{ 
		b = a; 
		a++; 
	} 

	@Override
	public int hashCode() 
	{ 
		return b; 
	} 

	public static void main(String args[]) 
	{ 
		hascode_tostring_demo s = new hascode_tostring_demo(); 

		System.out.println(s); 
		System.out.println(s.toString()); 
	} 
} 
