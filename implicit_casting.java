//the code is to demonstrate implicit casting
//Also knows as expanding type casting

//Widening Casting (automatically) – This involves the conversion 
//of a smaller data type to the larger type size.
//byte -> short -> char -> int -> long -> float -> double

//written by ISHAN MODI

public class implicit_casting 
{
	public static void main(String args[])
	{
		int i=100;
		long j=i;
		float k=j;
		double l=k;
		System.out.println("int:"+i);
		System.out.println("long:"+j);
		System.out.println("float:"+k);
		System.out.println("double:"+l);
	}
}
