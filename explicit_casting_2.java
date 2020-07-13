public class explicit_casting_2
{ 
    public static void main(String args[])  
    {  
        byte b;  
        int i = 355;  
        double d = 423.150; 
        b = (byte) i; 
        System.out.println("Conversion of int to byte: i = "+i+" ,b = "+b);  
        System.out.println("*************************************************"); 
        b = (byte) d;        
        System.out.println("Conversion of double to byte: d = "+d+" ,b= "+b);
    } 
}
  