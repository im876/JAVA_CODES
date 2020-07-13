//the following code is to demonstrate multiple stacks
//written by ishan modi
//static blocks are always executed before main block
class static_demo_2
{
	static
	{
		System.out.println("Welcome");
		System.out.println("This is static block I");

	}
	public static void main(String as[])
	{
		System.out.println("**********************");
		System.out.println("This is main() method");
	}
	static
	{
		System.out.println("**********************");
		System.out.println("This is static block II");

	}
	static
	{
		System.out.println("**********************");
		System.out.println("This is static block III");

	}
}