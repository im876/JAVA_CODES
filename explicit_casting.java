//the code is to demonstrate explicit casting
//Also knows as narrowing type casting

//Narrowing Casting (manually) – This involves converting a larger 
//data type to a smaller size type.

//double -> float -> long -> int -> char -> short -> byte

//written by ISHAN MODI

public class explicit_casting 
{
	public static void main(String args[])
	{
		double i=100;
		float j=(float)i;
		long k=(long)j;
		int l=(int)k;
		System.out.println("double:"+i);
		System.out.println("float:"+j);
		System.out.println("long:"+k);
		System.out.println("int:"+l);
	}
}
