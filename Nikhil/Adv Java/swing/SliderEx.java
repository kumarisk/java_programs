import javax.swing.*;
import javax.swing.event.*;
class SliderEx extends JFrame implements ChangeListener
{
   JSlider js;
   JTextField t;
   public SliderEx()
   {
      t=new JTextField();
      js=new JSlider(0,0,100,10);
	  setLayout(null);
	  js.setBounds(100,100,400,50);
	  t.setBounds(100,200,150,30);
	  add(js);
	  add(t);
	  js.addChangeListener(this);
	  js.setPaintTicks(true);
	  js.setMajorTickSpacing(20);
	  js.setMinorTickSpacing(10);
	  js.setPaintLabels(true);
	  js.setExtent(30);
   }
   public void stateChanged(ChangeEvent ce)
   {
	 int r=js.getValue();
     t.setText(""+r);
	 js.setToolTipText(""+r);
	}
   public static void main(String args[])
   {
     SliderEx s=new SliderEx();
	 s.setSize(1000,1000);
	 s.setVisible(true);
  }
  
}