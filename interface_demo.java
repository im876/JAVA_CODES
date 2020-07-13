/*interface code
 * by ISHAN MODI
 */

interface Abc
{
	void show();
}
class AbcImpl implements Abc
{
	public void show()
	{
		
		System.out.println("in show");
	}
}

public class interface_demo
{
	public static void main(String args[])
	{
	Abc obj = new AbcImpl();	
	obj.show();
	}
}