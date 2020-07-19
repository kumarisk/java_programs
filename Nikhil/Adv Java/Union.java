import java.awt.*;
import java.awt.event.*;
class UnionEx extends Frame implements ActionListener
{
	List l1,l2,l3;
	Button b1,b2;
	int a[]=new int[10];
	int b[]=new int[10];
	int c[]=new int[10];
	int d[]=new int[10];
	int len1,len2,i,j,temp1,temp2;
	public UnionEx() 
	{
		l1=new List();
		l2=new List();
		l3=new List();
		b1=new Button("Union");
		b2=new Button("Intersection");
		setLayout(null);
		l1.add("3");
		l1.add("2");
		l1.add("7");
		l1.add("1");
		l1.add("5");
		l2.add("6");
		l2.add("8");
		l2.add("9");
		l2.add("3");
		l2.add("1");
		
		l1.setBounds(100,100,100,100);
		l2.setBounds(400,100,100,100);
		l3.setBounds(200,200,100,100);
		b1.setBounds(200,100,100,30);
		b2.setBounds(200,150,100,30);
		l1.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(l1);	add(l2);	add(l3);	
		add(b1);	add(b2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			len1=l1.getItemCount();
			len2=l2.getItemCount();
			for(i=0;i<len1;i++)
			{
				a[i]=Integer.parseInt(l1.getItem(i));
			}
			for(i=0;i<len2;i++)
			{
				b[i]=Integer.parseInt(l2.getItem(i));
			}
			for(i=0;i<len1;i++)
			{
				c[i]=a[i];		
			}
			for(i=)
		}
	}
}
class Union
{
	public static void main(String args[])
	{
		UnionEx u=new UnionEx();
		u.setSize(1000,1000);
		u.setVisible(true);
	}	
}