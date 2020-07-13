package NPTEL_WEEK02;
class Student 
{ 
	// This is a method in class Student
    public void print()
    { 
		System.out.println("Hi! I am class STUDENT."); 
    } 
}

public class Q1
{ 
    public static void main(String args[])
    {
		// Creating object of class Student
		Student student = new Student();
		// Call 'print()' method of class Student 
		student.print();
     } 
}
