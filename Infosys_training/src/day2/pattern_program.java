package day2;

public class pattern_program {
	
public static void main(String[] args) {
		
		int row = 5, column = 10;
		
		System.out.println("Square Pattern");

		for(int r=1; r<=row; r++) {
			
			for(int c=1; c<=row; c++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		System.out.println("\nRectangle Pattern");

		for(int r=1; r<=row; r++) {
			
			for(int c=1; c<=column; c++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		System.out.println("\nRight Angle Triangle");
		
		for(int r=1; r<=row; r++) {
			
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		System.out.println("\nInverted Right Angle Triangle");
		
		for(int r=row; r>=1; r--) {
			
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		System.out.println("\nRight Angle Triangle");
		
		for(int r=1; r<=row; r++) {
			
			for(int sp=1; sp<=row-r; sp++)
				System.out.print("  ");
			
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			
			System.out.println();
		}
		
		System.out.println("\nPramid");
		
		for(int r=1; r<=row; r++) {
			
			for(int sp=1; sp<=row-r; sp++)
				System.out.print("  ");
			
			for(int c=1; c<=2*r-1; c++)
				System.out.print("* ");
			
			System.out.println();
		}

	
	}

}
