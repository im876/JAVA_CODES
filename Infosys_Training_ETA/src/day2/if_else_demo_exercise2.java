package day2;

public class if_else_demo_exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 2;
		byte b = 4;
		byte c = 1;
		int discriminant = (b*b)-(4*a*c);
		if(discriminant == 0)
			System.out.println("The root is " +((-b + discriminant)/2*a));
		else if(discriminant > 0)
			System.out.println("The root is " + ((-b + discriminant)/2*a) +" and" + ((-b - discriminant)/2*a));
		else
			System.out.println("The equation has no real root");
	}

}
