import javax.swing.*;
import java.awt.*;
class ProgressBarEx extends JFrame implements Runnable
{
   JProgressBar jp;
   Thread t;
   ImageIcon imgicon;
   Image img;
   public ProgressBarEx()
   {
     imgicon=new ImageIcon("1.jpg");
	 img=imgicon.getImage();
	 t=new Thread(this);
     jp=new JProgressBar(0,0,100);
	 setLayout(null);
	 jp.setBounds(100,100,500,40);
	 add(jp);
	 jp.setStringPainted(true);
	 //jp.setValue(30);
	// jp.setString("abc");
	 t.start();
   }
   public void run()
   {
	   while(jp.getValue()!=101)
	   {
		int r=jp.getValue();
        jp.setValue(r+10);
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e){}
	   }   
   }
   public void paint(Graphics g)
   {
	   g.drawImage(img,200,200,this);
   }
   public static void main(String args[])
   {
	  ProgressBarEx p=new ProgressBarEx();
      p.setSize(1000,1000);
	  p.setVisible(true);
   }
}