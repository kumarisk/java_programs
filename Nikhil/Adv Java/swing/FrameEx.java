import javax.swing.*;
import java.awt.*;
class FrameEx extends JFrame
{
   Container con;
   public FrameEx()
   {
      con=getContentPane();
	  con.setBackground(Color.green);
	  setTitle("MY JFRAME");
	  setVisible(true);
	  setSize(1000,1000);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public static void main(String args[])
   {
     FrameEx fr=new FrameEx();
   }
}