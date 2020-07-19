import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TabEx extends JFrame 
{
   JTabbedPane tb;
   public TabEx()
   {
      tb=new JTabbedPane();
	  tb.addTab("Color",new ColorTab());
	  tb.addTab("College",new CollegeTab());
	  tb.addTab("City",new CityTab());
	  tb.setBackgroundAt(0,Color.blue);
	  tb.setBackgroundAt(1,Color.magenta);
	  tb.setBackgroundAt(2,Color.green);
	  tb.setForegroundAt(0,Color.yellow);
	  tb.setForegroundAt(1,Color.white);
	  tb.setForegroundAt(2,Color.cyan);
	  tb.setToolTipTextAt(0,"Color Tab");
	  tb.setToolTipTextAt(1,"College Tab");
	  tb.setToolTipTextAt(2,"City Tab");
	  add(tb);
   }
   public static void main(String args[])
   {
	   TabEx t=new TabEx();
	   t.setVisible(true);
	   t.setSize(1000,1000);	   
   }
}
class ColorTab extends JPanel implements ActionListener
{
    JButton b1,b2,b3;
	public ColorTab()
		{
		   b1=new JButton("red");
		   b2=new JButton("blue");
		   b3=new JButton("yellow");
		   setLayout(null);
		   b1.setBounds(100,100,80,30);
		   b2.setBounds(200,100,80,30);
		   b3.setBounds(300,100,80,30);
		   add(b1);
		   add(b2);
		   add(b3);
		   b1.addActionListener(this);
		   b2.addActionListener(this);
		   b3.addActionListener(this);
		}
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
				setBackground(Color.red);	
			else if(ae.getSource()==b2)
				setBackground(Color.blue);	 
			else
				setBackground(Color.yellow);	 
		}
}	
class CollegeTab extends JPanel
{
    JTextField t1;
	JPasswordField t2;
	JLabel l1,l2;
	JButton b1,b2;
	public CollegeTab()
	{
	   l1=new JLabel("User Name:");
	   t1=new JTextField();
	   l2=new JLabel("Password:");
	   t2=new JPasswordField();
	   b1=new JButton("login");
	   b2=new JButton("signup");
	   setLayout(null);
	   l1.setBounds(100,100,100,30);
	   t1.setBounds(210,100,100,30);
	   l2.setBounds(100,150,100,30);
	   t2.setBounds(210,150,100,30);
	   b1.setBounds(100,200,80,20);
	   b2.setBounds(200,200,80,20);
	   add(b1);
	   add(b2);
	   add(t1);
	   add(t2);
	   add(l1);
	   add(l2);	   
	}
} 
class CityTab extends JPanel
{
   JCheckBox c1,c2,c3;
   public CityTab()
   {
		c1=new JCheckBox("C");
		c2=new JCheckBox("C++");
		c3=new JCheckBox("Java");
		add(c1);
		add(c2);
		add(c3);
	}
}
