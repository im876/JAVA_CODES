package day2;
public class nth_digit_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2345;
		int n = 3;
		System.out.println(i/(int)Math.pow(10, n-1)%10);
	}

}
