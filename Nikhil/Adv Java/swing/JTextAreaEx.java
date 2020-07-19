import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JTextAreaEx extends JFrame implements ActionListener
{
	JTextArea t;
	JButton b;
	String str;
	public JTextAreaEx()
	{
		t=new JTextArea();
		b=new JButton("Save");
		str="";
		setLayout(null);
		t.setBounds(100,100,400,100);
		b.setBounds(100,200,50,30);
		
		b.addActionListener(this);
		add(t);		add(b);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{			
			str=t.getText();
			System.out.println(" "+str);
		}
	}
	public static void main(String args[]) throws Exception
	{
		JTextAreaEx j=new JTextAreaEx();
		j.setSize(1000,1000);
		j.setVisible(true);
	}
}