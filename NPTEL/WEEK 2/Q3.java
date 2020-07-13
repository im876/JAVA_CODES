package NPTEL_WEEK02;
public class Q3
{ 
    public static void main(String[] args) 
    { 
		// Object of the main class is created
		Q3 q = new Q3();
		// Print method on object of Question class is called
		q.studentMethod();
    }
	
	// 'print()' method is defined in class Question
	void print(Q3 object)
	{
		System.out.print("Well Done!");
	}

	// 'studentMethod()' method is defined in class Question23
	void studentMethod()
	{
	// Calling a method named 'print()' in class Question23
		print(this);
	}

}