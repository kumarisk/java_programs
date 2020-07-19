import java.sql.*;
class RelativeEx
{
  public static void main(String args[])throws Exception
  {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 Connection con=DriverManager.getConnection("jdbc:odbc:abc");
	 Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	 ResultSet rs=st.executeQuery("select * from std");
     rs.first();
	 rs.absolute(3);
	 System.out.println("Third Records");
	 System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
	 rs.relative(4);
	 System.out.println("\nSeventh Records");
	 System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
	 rs.last();
	 rs.absolute(-4);
	 System.out.println("\nFifth Records");
	 System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
	 rs.relative(-3);
	 System.out.println("\nSecond Records");
	 System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));
	 
	 rs.close();
	 st.close();
	 
	 con.close();
	 
  }
}  