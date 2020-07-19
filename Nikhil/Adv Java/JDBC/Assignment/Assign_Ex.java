import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
class AssignEx extends Frame implements ActionListener
{    
   //FileDialog fd;
   Label l1,l2,l3,l4,l5;
   TextField t1,t2,t3,t4,t5,t6;
   Button b1,b2;
   Connection con;
   ResultSet rs;
   Statement pst;
   String str1,str2;
   int r1,r;     
   public AssignEx() throws Exception
    {
	   // Scanner sc=new Scanner(System.in);
	     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	     con=DriverManager.getConnection("jdbc:odbc:Student");
		 pst=con.createStatement();
		 rs=pst.executeQuery("select * from Student");
		 str1="";
		 str2="";
		l1=new Label("Roll No.");
		l2=new Label("Name");
		l3=new Label("Percentage");
		l4=new Label("Address");
		l5=new Label("Mobile");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t4=new TextField();
		t5=new TextField();
		t6=new TextField();
		b1=new Button("Save");
		b2=new Button("Show");
		setLayout(null);
		l1.setBounds(100,100,100,30);
		t1.setBounds(210,100,100,30);
		l2.setBounds(100,200,100,30);
		t2.setBounds(210,200,100,30);
		l3.setBounds(100,300,100,30);
		t3.setBounds(210,300,100,30);
		l4.setBounds(100,400,100,30);
		t4.setBounds(200,400,100,30);
		l5.setBounds(100,500,100,30);
		t5.setBounds(200,500,100,30);
		b1.setBounds(100,600,60,30);
		b2.setBounds(100,700,60,30);
		t6.setBounds(400,100,200,200);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) 
	{
     if(ae.getSource()==b1)
		{ 
     		 int a=Integer.parseInt(t1.getText());
		     String s=t2.getText();
			 Float f=Float.parseFloat(t3.getText());
			 String s1=t4.getText();
		     int m=Integer.parseInt(t5.getText());
			 String sql="insert into Student values("+a+",'"+s+"',"+f+",'"+s1+"',"+m+")";
			 try
           {
			 r1=pst.executeUpdate(sql);
			 System.out.print("\n"+r1+"record Inserted");
			 rs.close();
		  pst.close();
		  con.close();
			 }
			  catch(Exception e){}
	   }
	   if(ae.getSource()==b2)
	   {
	     // t6.setText("Roll\tName\tPercentage\tAddress\tMobile");
	     try
		  {
		             rs.next();
					 int c=rs.getInt(1);
	          	     t6.setText(" "+c+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		 }
		 catch(Exception e){System.out.println(e);
		}
	}
 }
	
}	
class Assign_Ex
{
	 public static void main(String args[])throws Exception
	 {
        AssignEx a=new AssignEx();
		a.setSize(1000,1000);
		a.setVisible(true);
		}
	}