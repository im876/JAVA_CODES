class MyThread extends Thread
{
    public void run()
    {
           System.out.println("in run() method");
    }
}

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */ 
public class thread_stack_demo 
{
    public static void main(String args[])
    {
           System.out.println("In main() method");
           method1();
    }
    
    static void method1()
    {
           MyThread obj=new MyThread();   
           obj.start();
    }
}
/*1)When we enter main() method:
As soon main is called by JVM it gets pushed onto stack1(main stack).
Now the main method is at the bottom of the stack i.e it is the 
first data block in the stack 1.

2)When main() calls method1()method:
As soon as main calls method1(), it gets pushed on the stack. 
i.e method1 is above the main data block in stack1 structure.

3)When method1() calls thread.start():
Here method1() creates new thread by calling thread.start(), as 
threads have their own stack- therefore a new stack is created.
i.e we now have 2 stacks here: stack 1 wherein we have our 
main method first followed by method1() block. & stack 2 
wherein we have new thread block 
 */
 