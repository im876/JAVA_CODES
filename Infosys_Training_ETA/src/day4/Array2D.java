package day4;

public class Array2D {

	public static void main(String[] args) {

		double array1[][];
		
		array1 = new double[2][2];
		
		array1[0][0] = 10;
		array1[0][1] = 20;
		array1[1][0] = 30;
		array1[1][1] = 40;
		
		double[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		System.out.println(array2[1][1]);
		
		double array3[][] = {{10.25, 25.36}, {78.69, 64.25}, {54.24, 62.145}};
		
		System.out.println("Row size of Array3: " + array3.length);
		System.out.println("Column size of Array3: " + array3[0].length);
		
		double array4[][] = {{1, 2, 3}, {4}, {5, 6}};
		
		System.out.println("Row size of Array4: " + array4.length);
		
		for(int r=0; r<array4.length; r++)
			System.out.println("Column size of row " + (r+1) + ": " + array4[r].length);
		
		
		
		
		

	}

}
