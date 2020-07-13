/*the following code is to demonstrate runtime polymorphism
 * code has been written by ishan modi
 */
class Bike
{  
  void run()
  {
	  System.out.println("running");
  }  
}  
class runtime_polymorphism_demo extends Bike
{  
  void run()
  {
	  System.out.println("running safely with 60km");
  }  
  
  public static void main(String args[])
  {  
    Bike b = new runtime_polymorphism_demo();//upcasting  
    b.run();  
  }  
}  