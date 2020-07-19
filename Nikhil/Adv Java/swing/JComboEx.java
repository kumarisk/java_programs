import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JComboEx extends JFrame implements ActionListener
{
	JComboBox c1,c2;
	Object obj[]={"Solapur","Satara","Sangli","Miraj","Pune","Mumbai","Kolhapur","Tuljapur"};
	Object c[]={"Hyderabad","Kadapa","Tirupati","Khammam","Siddipeth","Kurnool","Chittor"};
	public JComboEx()
	{
		c1=new JComboBox(obj);
		c2=new JComboBox(c);
		setLayout(null);
		c1.setBounds(100,100,100,30);
		c2.setBounds(220,100,100,30);
		add(c1);
		add(c2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	public static void main(String args[])
	{
		JComboEx j=new JComboEx();
		j.setSize(1000,1000);
		j.setVisible(true);
	}
}