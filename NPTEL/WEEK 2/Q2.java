package NPTEL_WEEK02;
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I am class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student_A { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Q2{ 
    public static void main(String args[]){
		// Creating object of class Student
		Student_A student = new Student_A();
		// Call 'print()' method of class Student 
		student.print();
		// Creating object of class School
		School school = new School();
		// Call 'print()' method of class School
		school.print();

    }
}