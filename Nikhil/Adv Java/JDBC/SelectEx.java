import java.sql.*;
import java.util.*;
class SelectEx
{
   public static void main(String args[])throws Exception
   {
		 Scanner sc=new Scanner(System.in);
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 Connection con=DriverManager.getConnection("jdbc:odbc:abc");
		 String sql="select * from emp";
		 PreparedStatement pst=con.prepareStatement(sql);
		 System.out.println("id\tname\tSal");
		 ResultSet rs=pst.executeQuery();
		 while(rs.next())
		 {
			 System.out.print(rs.getInt(1));
			 System.out.print("\t"+rs.getString(2));
			 System.out.print("\t"+rs.getFloat(3));
			 System.out.print("\n");
		 }
     rs.close();
	 pst.close();
	 con.close();
   }
 }   
	 