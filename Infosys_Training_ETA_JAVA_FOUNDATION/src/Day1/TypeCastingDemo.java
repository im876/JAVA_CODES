package Day1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//widening casting or explicit casting
		int i = 4578;
		long j = i;
		double k = j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		char ch = 'a';
		int i1 = ch;
		
		System.out.println("char = " + ch);
		System.out.println("char = " + i1);
		
		double result = 15 + 1234567436l + 48.35 + 100.36f + 'a';
		System.out.println(result);
		
		int result1 = 1 + 2 - 3 / 4 * 3 / 2;
		System.out.println(result1);
		
		int result2 = 1 + ((2 - 3) /4) * 3 / 2;
		System.out.println(result2);
		
		double result3 = 14 + (('a' - 6)/35) * 46.123 / 33 +'Z';
		System.out.println(result3);
		
		double result4 = 14 + ('a' - 6/35) * 46.123 / 33 +'Z';
		System.out.println(result4);
		
		float f = 24.23f;
		double g = f;
		System.out.println(g);
		
		//type casting character to short does not work since, char is of bigger value can't fit into short
		//char ch1 = 'b';
		//short i2 = ch1;
		
		
		//implicit casting
		float f1 = 3456.67f;
		int i3 = (int)f1;
		System.out.println("float = "+f1);
		System.out.println("int = "+i3);
		
		char cg = 'd';
		short dh = (short)cg;
		System.out.println("char = "+cg);
		System.out.println("short = "+dh);
		
		
		short fg = 128;
		byte br = (byte)fg;
		System.out.println("short = "+fg);
		System.out.println("byte = "+br);
		
		
		short fg1 = 129;
		byte br1 = (byte)fg1;
		System.out.println("short = "+fg1);
		System.out.println("byte = "+br1);
		
		short fg2 = 130;
		byte br2 = (byte)fg2;
		System.out.println("short = "+fg2);
		System.out.println("byte = "+br2);
		
		float pi1 = 22/(float)7;
		double pi2 = (double)22/7;
		System.out.println(pi1);
		System.out.println((pi2));
		
		long le = -2147483648l;
		int li = (int)le;
		long le1 = 2147483676l;
		int li2 = (int)le1;
		System.out.println(li);
		System.out.println(li2);
		
		long le2 = 214;
		char ch3 = (char)le2;
		System.out.println(ch3);
		
		
	}

}
