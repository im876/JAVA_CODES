package NPTEL_WEEK03;
import java.util.Scanner;
class Shape
{
   double length, breadth;
   Shape(double l, double b)
   { //Constructor to initialize a Shape object  
	   length = l;
	   breadth= b;
   }
   Shape(double len)
   {    //Constructor to initialize another Shape object  
     length = breadth = len;
   }
   double calculate()
   {  // To calculate the area of a shape object
    return length * breadth ;
   }
}
public class Q3 extends Shape
{    
   

	double height;
	Q3(double length,double h) 
        //base class constructor with one parameter is called
	{
		super(length); 
		height=h;
	}
	
	Q3(double length,double breadth,double h) 
        //base class constructor having two argument is called
	{         
		super(length,breadth);
		height=h;
	}
	double calculate()	
	{   // calculate the volume of the shape
		return length*breadth*height;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);//Create an object to read input                                                            
		double l=sc.nextDouble(); //Read length
		double b=sc.nextDouble(); //Read breadth	
		double h=sc.nextDouble(); //Read height
		Q3 myshape1 = new Q3(l,h);
		Q3 myshape2 = new Q3(l,b,h);
		double volume1;
		double volume2;
		volume1 = myshape1.calculate();
		volume2=myshape2.calculate();
		System.out.println(volume1);
		System.out.println(volume2);
	}
}
