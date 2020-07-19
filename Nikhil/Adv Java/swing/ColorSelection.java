/*JColorChooser class
method for selecting color from dialog window
public static Color showDialog(Component obj,String title,Color initial_color)*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ColorSelection extends JFrame implements ActionListener
{
  Color c;
  JButton jb;
  Container con;
  public ColorSelection()
  {
    con=getContentPane();
	jb=new JButton("select Color");
	setLayout(null);
	jb.setBounds(100,100,150,20);
	jb.addActionListener(this);
	add(jb);
  }
  public void actionPerformed(ActionEvent ae)
  {
    c=JColorChooser.showDialog(this,"Select Color",Color.red);
    con.setBackground(c);
  }
  public static void main(String args[])
  {
    ColorSelection s=new ColorSelection();
	s.setSize(1000,1000);
	s.setVisible(true);
  }
}
