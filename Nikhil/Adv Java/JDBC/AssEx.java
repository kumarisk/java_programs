import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class AssEx extends Frame implements ActionListener
{
	Connection con;
	ResultSet rs;
	Statement st;
	Label l1,l2,l3;
	TextField f1,f2,f3;
	Button b1,b2,b3;
	int flag;
	public AssEx()throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con=DriverManager.getConnection("jdbc:odbc:cde");
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		l1=new Label("Roll");
		l2=new Label("Name");
		l3=new Label("Per");
		f1=new TextField();
		f2=new TextField();
		f3=new TextField();
		b1=new Button("Save");
		b2=new Button("Next");
		b3=new Button("Previous");
		setLayout(null);
		l1.setBounds(100,100,80,20);
		l2.setBounds(100,200,80,20);
		l3.setBounds(100,300,80,20);
		f1.setBounds(200,100,80,20);
		f2.setBounds(200,200,80,20);
		f3.setBounds(200,300,80,20);
		b1.setBounds(100,400,80,20);
		b2.setBounds(200,400,80,20);
		b3.setBounds(300,400,80,20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(l1);add(l2);add(l3);
		add(f1);add(f2);add(f3);
		add(b1);add(b2);add(b3);
		rs=st.executeQuery("select * from stud");
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int r=Integer.parseInt(f1.getText());
			String s=f2.getText();
			float p=Float.parseFloat(f3.getText());
			String sql="insert into stud values("+r+",'"+s+"',"+p+")";
			try
			{
				int r1=st.executeUpdate(sql);
			}
			catch(Exception e){}
			f1.setText("");
			f2.setText("");
			f3.setText("");
		}
		else if(ae.getSource()==b2)
		{
			try
			{
				rs.next();
				int r=rs.getInt(1);
				String nm=rs.getString(2);
				float per=rs.getFloat(3);
				f1.setText(""+r);
				f2.setText(nm);
				f3.setText(""+per);				
			}
			catch(Exception e){}
		}
		else if(ae.getSource()==b3)
		{
			try
			{   
			    if(flag==0)
			    {		 
			      rs.afterLast();
				  flag=1;
				}  
				rs.previous();
				int r=rs.getInt(1);
				String nm=rs.getString(2);
				float per=rs.getFloat(3);
				f1.setText(""+r);
				f2.setText(nm);
				f3.setText(""+per);				
			}
			catch(Exception e){}
		}
	}
	public static void main(String args[])throws Exception
	{
		AssEx a=new AssEx();
		a.setSize(1000,1000);
		a.setVisible(true);
	}
}