import javax.swing.*;
import java.awt.*;
class ImageEx extends JFrame
{
      ImageIcon imgicon;
      Image img;
	  public ImageEx()
	  {
	    imgicon=new ImageIcon("Penguins.jpg");
	    img=imgicon.getImage();
	  }
	 public void paint(Graphics g)
     {
	   g.drawImage(img,100,100,null);
     }
   public static void main(String args[])
   {
	   ImageEx im=new ImageEx();
	   im.setSize(1000,1000);
	   im.setVisible(true);
   }
}