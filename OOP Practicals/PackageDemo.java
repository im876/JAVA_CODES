package OOP_PRACS;
import relational.Compare;
public class PackageDemo
{
	public static void main(String args[])
	{
		int val1 = 7, val2 = 9;
		Compare comp = new Compare();
		int max = comp.getMax(val1, val2); // get the max value
		System.out.println("Maximum value is " + max);
	}
}