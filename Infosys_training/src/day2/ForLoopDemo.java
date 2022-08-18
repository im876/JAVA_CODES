package day2;

public class ForLoopDemo {

	public static void main(String[] args) {

		int i;
		
		for(i=1; i<11; i++)
			System.out.println(i + ". Java");
		
		System.out.println("i : " + i + "\n");
		
		for(i=2; i<11; i+=2)
			System.out.println(i + ". Java");
		
		System.out.println("i : " + i+ "\n");
		
		for(i=5; i<100; i*=5)
			System.out.println(i + ". Java");
		
		System.out.println("i : " + i + "\n");
		
		for(i=10; i>=1; --i)
			System.out.println(i + ". Java");
		
		System.out.println("i : " + i + "\n");
		
		i=1;
		
		for(; i<11; i++)
			System.out.println(i + ". HI");
		
		for(int x=1, y=10; x<=10 && y>=1; x++, y--)
			System.out.println(x + ". Hi " + y + ". Java");
		
		System.out.println("i : " + i + "\n");
		/*for(;;)
			System.out.println("Hi");*/
		
		int l=11, u=20;
		
		for(i=l; i<=u; i++) {
			
			System.out.print(i + " ");
			
			if((int)Math.pow((int)Math.sqrt(i), 2) == i)
				break; //Stop the current iteration
		}
		
		System.out.println();
		
		for(i=l; i<=u; i++) {
			
			if(i%3 == 0)
				continue; //Stop the current iteration
			
			System.out.print(i + " ");			
			
		}	

	}

}
