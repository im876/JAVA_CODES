class SuperClass
{
   public static void sample()
   {
      System.out.println("Method of the super class");
   }
}
public class RuntimePolymorphism extends SuperClass 
{
   public static void sample()
  {
      System.out.println("Method of the sub class");
   }
   public static void main(String args[])
   {
      SuperClass obj1 = new RuntimePolymorphism();
      RuntimePolymorphism obj2 = new RuntimePolymorphism();
      obj1.sample();
      obj2.sample();
   }
}
