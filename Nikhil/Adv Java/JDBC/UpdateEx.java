import java.sql.*;
import java.util.*;
class UpdateEx
{
   public static void main(String args[])throws Exception
   {
		 Scanner sc=new Scanner(System.in);
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 Connection con=DriverManager.getConnection("jdbc:odbc:abc");
		 String sql="update emp set empname='RRR' where empsal<7000";
		 PreparedStatement pst=con.prepareStatement(sql);
		 /* System.out.println("\nEnter Id:");
		 int id=sc.nextInt();
		 System.out.println("\nEnter Name:");
		 String n=sc.next();
		 System.out.println("\nEnter Salary:");
		 float s=sc.nextFloat();
		 pst.setInt(1,id);
		 pst.setString(2,n);
		 pst.setFloat(3,s); */
		 int r=pst.executeUpdate();
		 System.out.println("\n"+r+" records Inserted");
	 pst.close();
	 con.close();
   }
 }   
	 