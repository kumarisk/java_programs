import javax.swing.*;
import java.awt.*;
class ComponentEx extends JFrame
{
     JTextField t;
	 JLabel l;
	 JButton b;
	 JCheckBox c;
	 JPanel p;
	 JScrollPane jp;
	 
	 public ComponentEx()
	 {
	    t=new JTextField();
		l=new JLabel("No:");
		b=new JButton("B");
		c=new JCheckBox("C++");
		p=new JPanel();	
		p.setLayout(null);
		l.setBounds(100,100,100,20);
		t.setBounds(210,100,100,20);
		b.setBounds(100,150,100,20);
		c.setBounds(210,150,100,20);
		p.add(l);
		p.add(b);
		p.add(t);
		p.add(c);
		ImageIcon ii = new ImageIcon("1.jpg");
		JScrollPane jp = new JScrollPane(new JLabel(ii));
		//jp=new JScrollPane(p,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);	
		getContentPane().add(jp);	
		jp.add(p);
	 }
	 public static void main(String args[])
	 {
	    ComponentEx ce=new ComponentEx();
		ce.setSize(1000,700);
		ce.setVisible(true);
	 }
}