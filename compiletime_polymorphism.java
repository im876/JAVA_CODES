class ABC
{
   public void myMethod()
   {
	System.out.println("Overridden Method");
   }
}
public class compiletime_polymorphism extends ABC
{
   public void myMethod()
  {
	System.out.println("Overriding Method");
   }
   public static void main(String args[])
   {
	ABC obj = new compiletime_polymorphism();
	obj.myMethod();
   }
}
