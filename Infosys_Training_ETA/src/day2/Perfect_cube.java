package day2;

public class Perfect_cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 27;
		int cbroot = (int) Math.cbrt(n);
		if (Math.pow(cbroot, 3)== n)
			System.out.println("Perfect cube");
		else
			System.out.println("Not a cube");

	}

}
