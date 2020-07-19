import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FormEx1 implements ActionListener
{
	JButton b;
	JTextField t;
	JFrame f;
	JPanel p;	
	JLabel l;
	public FormEx1()
	{
		b=new JButton("Login");
		t=new JTextField();
		l=new JLabel("Click here");
		f=new JFrame("MY app");
		p=new JPanel();
		f.setSize(800,600);
		f.setVisible(true);
		p.setLayout(null);
		b.setBounds(100,100,80,30);
		t.setBounds(190,100,80,30);
		l.setBounds(30,90,80,30);
		b.addActionListener(this);
		p.add(b);
		f.add(p);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			
			p.add(l);
			p.add(t);
			f.add(p);
			t.setText("hello");
		}			
	}
	public static void main(String args[])
	{
		FormEx1 fx= new FormEx1();
	}
}
