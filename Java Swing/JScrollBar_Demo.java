package java_swing;
import javax.swing.*;
public class JScrollBar_Demo
{
	JScrollBar_Demo()
	{
		JFrame a = new JFrame("Scroll Example");
		JScrollBar b = new JScrollBar();
		b.setBounds(90,90,20,110);
		a.add(b);
		a.setSize(300,300);
		a.setLayout(null);
		a.setVisible(true);
	}
	public static void main(String args[])
	{
		new JScrollBar_Demo();
	}
}