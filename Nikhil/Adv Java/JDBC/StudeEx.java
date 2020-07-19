import java.sql.*;
import java.util.*;
class StudeEx
{
  public static void main(String args[])throws Exception
  {
	Scanner sc=new Scanner(System.in);
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con=DriverManager.getConnection("jdbc:odbc:abc");
	Statement st=con.createStatement();
    Statement st1=con.createStatement();
	//String sql="insert into std values(1,'ABC',65,'first year')";
	ResultSet rs=st1.executeQuery("select max(roll) from std");
	System.out.println("\nEnter Name and Per");
	rs.next();
	int roll=rs.getInt(1)+1;
	String n=sc.next();
	int p=sc.nextInt();
	String sql="insert into std values("+roll+",'"+n+"',"+p+",'first year')";
	int r=st.executeUpdate(sql);
	System.out.println(r+" records Inserted"); 
     rs.close();   	   	
     st1.close();   
	st.close();
	con.close();
 }  
}  


