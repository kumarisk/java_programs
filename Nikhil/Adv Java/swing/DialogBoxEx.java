import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class DialogBoxEx extends JFrame implements ActionListener
{
    JButton b1,b2;
	int r;
	//JTextField t;
	public DialogBoxEx()
	{
	    b1=new JButton("Message Box");
		b2=new JButton("Confirm Box");
		setLayout(null);
		b1.setBounds(100,100,300,30);
		b2.setBounds(100,150,300,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);add(b2);
    }
	public void actionPerformed(ActionEvent ae)
	{
	   if(ae.getSource()==b1)
		JOptionPane.showMessageDialog(this,"Message Box","Message Title",JOptionPane.ERROR_MESSAGE);
	   else
		 r=JOptionPane.showConfirmDialog(this,"Confirm Box","Confirm Title",JOptionPane.YES_NO_OPTION);
	 System.out.print("\nR="+r);
	}
   public static void main(String args[])
   {
	   DialogBoxEx d=new DialogBoxEx();
	   d.setSize(1000,1000);
	   d.setVisible(true);
   }
}