import java.awt.*;
import javax.swing.*;
class RadioButtonEx extends JFrame 
{
  JRadioButton c1,c2;
  ButtonGroup bg;
  JTextField t;
  public RadioButtonEx()
  {  
	 bg=new ButtonGroup();
     c1=new JRadioButton();
	 c2=new JRadioButton();
	 setLayout(null);
	 c1.setLabel("Male");
	 c2.setLabel("Female");
	 c1.setBounds(100,100,100,80);
	 c2.setBounds(100,150,800,80);
	 bg.add(c1);bg.add(c2);  
	 add(c1);add(c2);  
	 c1.setToolTipText("Male");
	 c2.setToolTipText("Female");
	 c1.setMnemonic('M');
	 c2.setMnemonic('F');
	 t=new JTextField();
	 t.setToolTipText("enter number");
	 t.setBounds(100,400,100,20);
	 add(t);
	 //t.setMnemonic('t');
}
  public static void main(String args[])
  {
    RadioButtonEx b=new RadioButtonEx();
    b.setSize(1000,1000)	;
	b.setVisible(true);
  }
}