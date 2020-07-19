import java.awt.*;
import java.awt.event.*;
class AwtContainerDemo 
{
	Frame f;
	Label l;
	List c;
	Panel p;
	public AwtContainerDemo()
	{
		f = new Frame("Java AWT Examples");
		c = new List();
		p = new Panel();
		
		p.setLayout(null);
		c.addItem("C");
		c.setBounds(100,100,80,30);
		p.add(c);		
		f.add(p);
		}
	
	public static void main(String[] args)
	{
		AwtContainerDemo awtContainerDemo = new AwtContainerDemo();	
		awtContainerDemo.setSize(1000,1000);
		awtContainerDemo.setVisible(true);
	}
}