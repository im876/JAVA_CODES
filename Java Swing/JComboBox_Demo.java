package java_swing;
import javax.swing.*;
public class JComboBox_Demo{
JFrame a;
JComboBox_Demo(){
a = new JFrame("example");
String courses[] = {"doodh","chai", "coffee"};
JComboBox c = new JComboBox(courses);
c.setBounds(40,40,150,20);
a.add(c);
a.setSize(400,400);
a.setLayout(null);
a.setVisible(true);
}
public static void main(String args[])
{
new JComboBox_Demo();
}
}  