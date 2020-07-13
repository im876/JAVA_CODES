/*
 * multiple interface code by ishan modi 
 */

interface Abcdef
{
	void show();
}
interface yyy
{
	
}
interface xyz extends Abc,yyy
{
	
}

public class interface_demo_4
{
	public static void main(String args[])
	{
	Abcdef obj = () -> System.out.println("in show");
	obj.show();
	}
}