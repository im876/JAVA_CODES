// sequence : 1,2,4,8,16,32,64,128,256


package day2;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n = 5;
	for (int i = 0; i <=n;  i++)
	{
          System.out.print ((int) Math.pow(2, i));
          if(i<n) 
        	  System.out.print(",");
	}	  
	}

}
