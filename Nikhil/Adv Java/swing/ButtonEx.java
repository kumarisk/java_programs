import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ButtonEx extends JFrame implements ActionListener
{
  JButton b1,b2;
  Icon icon;
  Container con;
  public ButtonEx()
  {
	 con=getContentPane();
     b1=new JButton("b1");
	 icon=new ImageIcon("1.jpg");
	 b2=new JButton("b2",icon);
	 setLayout(null);
	 b1.setBounds(100,100,100,20);
	 b2.setBounds(100,150,500,400);
	 add(b1);
	 add(b2);
	 b1.setToolTipText("button b1");
	 b2.setToolTipText("button b2");
	 b1.setMnemonic('b');
	 b2.setMnemonic('c');
	 b1.addActionListener(this);
	 b2.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
	 if(ae.getSource()==b1)
       con.setBackground(Color.blue);
     else
	  con.setBackground(Color.cyan);

  }
  public static void main(String args[])
  {
    ButtonEx b=new ButtonEx();
    b.setSize(1000,1000)	;
	b.setVisible(true);
  }
}