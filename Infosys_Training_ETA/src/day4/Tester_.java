package day4;

public class Tester_ {

	public static void main(String[] args) {		
		
		Swap obj = new Swap();
		
		System.out.println("Before Swapping: " + obj.a + " " + obj.b);
		
		obj.swapping(obj.a , obj.b); // call by value
		
		System.out.println("After Swapping: " + obj.a + " " + obj.b);
		
		System.out.println("\nBefore Swapping: " + obj.a + " " + obj.b);
		
		obj.swapping2(obj); //call by reference
		
		System.out.println("After Swapping: " + obj.a + " " + obj.b);	

	}

}

class Swap{
	
	int a = 100, b = 200;
	
	void swapping(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("In Method: " + a + " " + b);
	}
	
	void swapping2(Swap refVar) {
		
		int temp = refVar.a;
		refVar.a = refVar.b;
		refVar.b = temp;
		
		System.out.println("In Method: " + refVar.a + " " + refVar.b);
	}
	
}
