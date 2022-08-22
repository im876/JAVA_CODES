package Lex_Introduction_To_Java;

class a_022_pattern {
	public static void main(String[] args) {
		// Implement your code here 
		int row = 5;
		for(int r=row; r>=1; r--) {
			
			for(int c=1; c<=r; c++)
				System.out.print("* ");
			
			System.out.println();
			}
	}
}
