package day4;

import java.util.Scanner;

public class Array1D {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//Declaration		
		int a[];
		
		//Instantiation
		a = new int[10];
		
		System.out.println("First element: " + a[0]);
		
		//Initialization
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println("First element: " + a[0]);
		
		System.out.println("Length of array A: " + a.length);
		
		int b[] = {100, 200, 300};
		
		System.out.println("Length of array B: " + b.length);
		
		int c[], d, e;	
		
		int []f, g, h;
		
		g = new int[20];
		
		System.out.println("Length of array G: " + g.length);
		
		//Printing an array
		int array1[] = {45, 78, 64, 12, 45, 78, 65, 32};
		
		Array1D obj = new Array1D();
		System.out.print("ARRAY1: ");
		
		obj.printArray(array1);	
		
		System.out.print("Array A:");
		
		obj.printArray(a);	
		
		int array2[] = obj.getArray(5);
		
		System.out.print("Array 2:");
		obj.printArray(array2);

	}
	
	void printArray(int[] array) {
		
		/*
		//for-loop		
		for(int i=0; i<array.length; i++) 
			System.out.print(array[i] + " ");
		*/
		//for-each
		
		for(int element : array)
			System.out.print(element + " ");
		
		array[0] = 1000;
		
		System.out.println();
	}
	
	int[] getArray(int size) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] temp = new int[5];
		
		System.out.println("Enter " + size + " elements");
		
		for(int i=0; i<size; i++)
			temp[i] = scan.nextInt();
		
		return temp;
		
		
	}

}
