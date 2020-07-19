import javax.swing.*;
import java.awt.*;
class ListEx extends JFrame
{
  JList l1;
  public ListEx()
  {
    Object obj[]={"Solapur","Mumbai","Pune","Kolhapur","Latur"};
	l1=new JList(obj);
	setLayout(null);
	l1.setBounds(100,100,400,200);
	l1.setSelectionBackground(Color.blue);
	l1.setSelectionForeground(Color.red);
	add(l1);
  }
  public static void main(String args[])
  {
    ListEx le=new ListEx();
	le.setSize(1000,1000);
	le.setVisible(true);
  }
}