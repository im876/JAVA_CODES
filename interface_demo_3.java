/*
 * interface code by ishan modi 
 */

interface Abcde
{
	void show();
}

public class interface_demo_3
{
	public static void main(String args[])
	{
	Abcde obj = () -> System.out.println("in show");
	obj.show();
	}
}