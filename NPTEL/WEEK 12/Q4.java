package NPTEL_WEEK12;
class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class Q4 extends Parent {
   public static void testClassMethod() {
        
    }
public static void main(String[] args) {
        
     // Call the instance method in the Parent class 
    Q4 c= new Q4();
    c.testInstanceMethod();
		
     // Call the static method in the Parent class
    Parent.testClassMethod();
    
    //Parent ob=c;
   //ob.testClassMethod();
  }
}
