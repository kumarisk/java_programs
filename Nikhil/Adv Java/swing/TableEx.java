import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
class TableEx extends JFrame implements ActionListener
{
   JTable t;
   JPanel jp;
   JScrollPane pane;
   JTableHeader header;
   JButton b;
   public TableEx()
   {
	  jp=new JPanel();
	  b=new JButton("print");
      Object row[][]={{"AAA","1","67.67"},{"BBB","2","65.67"},{"CCC","3","77.7"},{"DDD","4","44.4"}};
	  Object col[]={"Name","Roll","Per"};
	  t=new JTable(row,col);
	  t.setRowHeight(50);
	  t.setDragEnabled(true);
	  t.setRowMargin(15);
	  t.setSelectionBackground(Color.blue);
	  t.setSelectionForeground(Color.red);
	  t.setFont(new Font("arial",1,10));
	  jp.add(t);
	  jp.add(b);
	 header=t.getTableHeader();
	 header.setFont(new Font("verdana",1,10));
	 header.setBackground(Color.yellow);
	 header.setForeground(Color.blue);
	 header.setResizingAllowed(false);
	 header.setReorderingAllowed(false);
	 t.setRowSelectionAllowed(false);
	 pane=new JScrollPane(jp,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	 setLayout(new BorderLayout());
	// pane.setBounds(0,0,500,200);
	 //b.setBounds(300,200,80,20);
	 b.addActionListener(this);
	// pane.add(b);
	 add(pane);
	 
   }
   public void actionPerformed(ActionEvent ae)
   {
	   
	   try
	   {
	    boolean complete = t.print();
		if(complete)
			System.out.println("Success");
		else
			System.out.println("\nFail");
	   }
	   catch(Exception e){}
   }
   public static void main(String args[])
   {
     TableEx te=new TableEx();
	 te.setSize(1000,1000);
	 te.setVisible(true);
   }
}