import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
class Registration1 extends JFrame implements ActionListener
{
	JPanel p,p1;
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem mi1,mi2,mi3,mi4,mi5;
	JButton b;
	public Registration1()
	{
		b=new JButton("Save");
		p=new JPanel();
		mb=new MenuBar();
		m1=new Menu("Student");	m2=new Menu("Course Manage");	m3=new Menu("Batches");
		mi1=new MenuItem("New");	mi2=new MenuItem("Create");	mi3=new MenuItem("Update");	mi4=new MenuItem("Remove");
		p.setLayout(null);
		m1.add(mi1);	m2.add(mi2);	m2.add(mi3);	m2.add(mi4);
		mb.add(m1);		mb.add(m2);		mb.add(m3);		setMenuBar(mb);
		p.add(b);
		mi1.addActionListener(this);
		b.setBounds(100,100,80,30);
		add(p);
		p.setVisible(false);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi1)
		{
			p.setVisible(true);
		}
	}
	public static void main(String args[])
	{
		Registration1 r=new Registration1();
		r.setSize(800,600);
		r.setVisible(true);
	}	
}	
class Register extends JFrame
{
	JPanel p;
}