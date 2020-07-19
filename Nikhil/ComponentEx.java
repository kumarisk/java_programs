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
	Image img;
	public ComponentEx()
	{
		t=new JTextField();
		l=new JLabel("NO:");
		c=new JCheckBox("C");
		b=new JButton("B");
		p=new JPanel();
		//setLayout(null);
		p.setLayout(null);
		l.setBounds(100,100,100,20);
		t.setBounds(210,100,100,20);
		b.setBounds(100,150,100,20);
		c.setBounds(210,150,100,20);
		/* p.add(l);
		p.add(b);
		p.add(t);
		p.add(c);*/
		img=new ImageIcon("1.jpg").getImage();
 		jp=new JScrollPane(p,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		getContentPane().add(jp);
	
		jp.add(p);
		add(jp);
		
	}
	
	public static void main(String args[]) throws Exception
	{
		ComponentEx ce=new ComponentEx();
		ce.setSize(500,500);
		ce.setVisible(true);
	}
}