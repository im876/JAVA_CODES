//the code is to demonstrate initializer block

public class initializer_demo
{
	{
		System.out.println("Welcome");
		System.out.println("This is Initializer block");

	}
	public initializer_demo()
	{
		System.out.println("Default Constructor invoked"); 
	}
	public static void main(String as[])
	{
		initializer_demo obj = new initializer_demo();
		System.out.println("This is main() method");
	}
}
	