import javax.swing.*;
import java.awt.*;
/*<applet code=Test width=1000 height=1000></applet>*/
public class Test extends JApplet
{
  String txt;
  Font f;
  public void init()
  {
    f=new Font("arial",1,30);
    txt="From Init Method";
	System.out.println("From Init");
  }
  public void start()
  {
    txt="From Start Method";
	 System.out.println("From Start");
  }
  public void stop()
  {
	  txt="From Stop Method";
	   System.out.println("From Stop");
  }
  public void destroy()
  {
	  txt="From Destroy Method";
	  System.out.println("From Destroy");
  }
  public void paint(Graphics g)
  {
	  g.setFont(f);
	  g.drawString(txt,200,200);
  }
}