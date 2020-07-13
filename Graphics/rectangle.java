package graphics;
import java.awt.*;
public class rectangle extends Frame
{
  public rectangle()
  {
    setTitle("Right-angled Drawing");
    setSize(475, 300);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.RED);
    g.fillRect(80, 80, 150, 100);
    g.setColor(Color.yellow);
    g.fillRect(80, 180, 150, 100);
    g.setColor(Color.green);
    g.fillRect(80, 280, 150, 100);
  }
  public static void main(String args[])
  {
    new rectangle();
  }
}