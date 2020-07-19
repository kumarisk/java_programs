import java.sql.*;
class ResultSetEx
{
   public static void main(String args[])throws Exception
   {
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	 Connection con=DriverManager.getConnection("jdbc:odbc:abc");
	 Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	 String sql="select * from emp";
	 ResultSet rs=st.executeQuery(sql);
	 System.out.println("id\tname\tSal");
	 rs.afterLast();
	 while(rs.previous())
	 {
	   System.out.print(rs.getInt(1));
	   System.out.print("\t"+rs.getString(2));
       System.out.print("\t"+rs.getFloat(3));
       System.out.print("\n");
	  }  
	  rs.close();
	  st.close();
	  con.close();
	}
}	