
public class execution_hierachy 
{
	public void non_static()
	{
		System.out.println("Non-static method");
	}
	public static void static_()
	{
		System.out.println("Static method");
	}
	public static void main(String args[])
	{
		execution_hierachy object1= new execution_hierachy();
		object1.non_static();
		object1.static_();
		System.out.println("Main method");
	}
}
