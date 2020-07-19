import java.awt.*;
import javax.swing.*;
class CheckBoxEx extends JFrame
{
  JCheckBox c1,c2;
  Icon icon;
  public CheckBoxEx()
  {
     c1=new JCheckBox("Cricket");
	 c2=new JCheckBox("FootBall");
	 setLayout(null);
	 c1.setBounds(100,100,100,80);
	 c2.setBounds(100,150,100,80);
	 add(c1);
	 add(c2);
	 c1.setToolTipText("Cricket");
	 c2.setToolTipText("FootBall");
	 c1.setMnemonic('b');
	 c2.setMnemonic('c');
}
  public static void main(String args[])
  {
    CheckBoxEx b=new CheckBoxEx();
    b.setSize(1000,1000)	;
	b.setVisible(true);
  }
}