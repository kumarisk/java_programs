import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Gayatri extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu m1;
	JMenuItem mi1,mi2,mi3;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;

	public Gayatri()
	{
		
		mb=new JMenuBar();
		m1=new JMenu("Student");
		mi1=new JMenuItem("Registration");
		mi2=new JMenuItem("Update");
		mi3=new JMenuItem("Remove");
		l1=new JLabel("Course Applied");
		l2=new JLabel("Name of Candidate\nSurName");
		l3=new JLabel("First Name");
		l4=new JLabel("Father's Name");
		l5=new JLabel("Address of Candidate");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		setLayout(null);
		l1.setBounds(100,100,100,20);
		t1.setBounds(210,100,100,20);
		l2.setBounds(100,150,100,20);
		t2.setBounds(210,150,100,20);
		l3.setBounds(100,200,100,20);
		t3.setBounds(210,200,100,20);
		l4.setBounds(100,250,100,20);
		t4.setBounds(210,250,100,20);
		l5.setBounds(100,300,100,20);
		t5.setBounds(210,300,100,20);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mb.add(m1);
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
	 	add(l1);add(l2);add(l3);
		add(l4);add(l5);add(t1);
		add(t2);add(t3);add(t4);
		add(t5); 
     	setJMenuBar(mb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(600,200);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi1)
		{
		 
		}
	}
}
class GayatriEx
{
	public static void main(String args[]) throws Exception
	{
      Gayatri g=new Gayatri();
	  g.setSize(1200,1200);
	  g.setVisible(true);
	}
}