package day2;

public class Reverse {

	public static void main(String[] args) {

		int num = 1331, rev = 0, count=0;
		int temp = num;
		
		while(num!=0) {
			
			rev = rev*10 + num%10;		
			
			num /= 10;
			
			count++;
			
			//System.out.println(rev + " " + num);
		}
		
		System.out.println("Reverse of " + temp + " is :" + rev);
		System.out.println("No of digits in " + temp + " is: " + count);
		
		if(rev == temp)
			System.out.println(temp + " is a palindrome");
		else
			System.out.println(temp + " is not a palindrome");
		

	}

}
