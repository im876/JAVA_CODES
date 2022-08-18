package day2;

public class DoWhileDemo {

	public static void main(String[] args) {

		int i =1;
		
		for(; i<1; i++)
			System.out.println("For loop");
		
		while(i<1)
			System.out.println("While loop");
		
		do {
			System.out.println("Do-While");
		}while(i<1);

	}

}
