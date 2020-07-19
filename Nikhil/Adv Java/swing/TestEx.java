import java.awt.*;
import javax.swing.*;
public class TestEx extends JApplet
{
	JTextField t;
	JButton b;
	public void init()
	{
	  t=new JTextField();
	  b=new JButton("b1");
	  setLayout(null);
	  t.setBounds(100,100,100,20);
	  b.setBounds(100,150,100,20);
	  add(t);add(b);
	  
	}
}