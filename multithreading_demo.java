//the code is to demonstrate multithreading
class ThreadA extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Square of int i of value"+i+"is:"+(i*i));
		}
		System.out.println("EXITING FROM THREAD A");
	}
}

class ThreadB extends Thread
{
	public void run()
	{
		for(int j=1; j<=5; j++)
		{
			System.out.println("Cube of int j of value"+j+"is:"+(j*j*j));
		}
		System.out.println("EXITING FROM THREAD B");
	}
}

class ThreadC extends Thread
{
	public void run()
	{
		for(int k=1; k<=5; k++)
		{
			System.out.println("4th root of int k of value"+k+"is:"+(k*k*k*k));
		}
		System.out.println("EXITING FROM THREAD C");
	}
}

public class multithreading_demo
{
	public static void main(String args[])
	{
		 ThreadA a = new ThreadA();
         ThreadB b = new ThreadB();
         ThreadC c = new ThreadC();
         a.start();
         b.start();
         c.start();
         System.out.println("... Multithreading is over ");
	}
}