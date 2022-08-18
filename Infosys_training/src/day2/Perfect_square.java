package day2;

public class Perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		int sqroot = (int) Math.sqrt(n);
		if (sqroot * sqroot == n)
			System.out.println("Perfect square");
		else
			System.out.println("Not a Perfect Square");

	}

}
