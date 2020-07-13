package NPTEL_WEEK06;
public class Q1 extends Thread
{
	public void run()
	{
		System.out.print("Thread is Running.");
	}

	public static void main(String args[])
	{  

		// Creating object of thread class
		Q1 thread=new Q1();  

                // Start the thread
		thread.start();
	}  
}
