package NPTEL_WEEK04;
import java.util.Scanner;
//Import of pre-defined package java.lang and class System and all of its member
import static java.lang.System.*;
//main class Question is created
public class Q1
{
	public static void main(String[] args) 
	{
	// Scanner object is created
		Scanner scanner = new Scanner(System.in);
  // Read String input using scanner class
		String courseName = scanner.nextLine(); 
  // Print the scanned String
		out.println("Course: " + courseName); 
	}
}