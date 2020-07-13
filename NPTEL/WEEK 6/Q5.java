package NPTEL_WEEK06;
class Q5 extends Thread
{  
	  public void run()
	  {  
	    System.out.println("Thread is running.");  
	  }  
	  public static void main(String args[])
	  {  
	    Q5 t=new Q5();  
	    System.out.println("Name of thread 't':"+ t.getName());  

	// start the thread  
	  t.start();  
	// set the name
	  t.setName("NPTEL");  

	   System.out.println("New name of thread 't':"+ t.getName());  
	 }  
}

