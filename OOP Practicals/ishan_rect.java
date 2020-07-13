package OOP_PRACS;
import java.util.Scanner;
class Rectangle
{ 
	//declaring the variables
	private double width,length,area;
	private String colour;
	Scanner in=new Scanner(System.in);
	//declaring the length function
	void getLength()
	{
		System.out.println("Enter the length of the rectangle");
		length=in.nextDouble();
	}
	//declaring the width function
	void getWidth()
	{
		System.out.println("Enter the width of the rectangle");
		width=in.nextDouble();
	}
	//declaring the colour function
	String getColour()
	{
		System.out.println("Enter the colour of the rectangle");
		colour=in.next(); return colour;
	}
	//declaring the area function
	double findArea()
	{
		area = length * width;
		return (area);
	}
	String showcolour()
	{ 
		return colour;
	}
}
public class ishan_rect
{ 
	public static void main(String[] args)
	{ 
		//creating two objects for the rectangle
		Rectangle r1= new Rectangle();
		Rectangle r2=new Rectangle();
		//taking data of the first rectangle
		System.out.println("\n/******Enter the data of First rectangle******/\n");
		r1.getLength();
		r1.getWidth();
		String c1=r1.getColour();
		//taking data of the second rectangle
		System.out.println("\n/******Enter the data of Second rectangle******/\n");
		r2.getLength();
		r2.getWidth();
		String c2=r2.getColour();
		//--------------------if to compare the two rectangle----------------------
		if(r1.findArea()==r2.findArea()&& (c1.compareTo(c2)==0))
			System.out.println("\n/------Matching Rectangles------/\n");
		else
			System.out.println("\n/------Non-Matching Rectangles------/\n");
	}
}