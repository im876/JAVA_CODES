package java_swing;
import javax.swing.*;
public class JMenu_demo
{
	JMenu menu;
	JMenuItem a1,a2;
	JMenu_demo()
	{
		JFrame a = new JFrame("Example");
		menu = new JMenu("options");
		JMenuBar m1 = new JMenuBar();
		a1 = new JMenuItem("Exit");
		a2 = new JMenuItem("Nikal, Pehli Phursat Mein Nikal");
		menu.add(a1);
		menu.add(a2);
		m1.add(menu);
		a.setJMenuBar(m1);
		a.setSize(400,400);
		a.setLayout(null);
		a.setVisible(true);
	}
	public static void main(String args[])
	{
		new JMenu_demo();
	}
}