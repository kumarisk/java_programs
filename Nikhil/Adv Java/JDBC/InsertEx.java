import java.sql.*;
import java.util.*;
class InsertEx
{
   public static void main(String args[])throws Exception
   {
	     String msg="yes";
		 Scanner sc=new Scanner(System.in);
		 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 Connection con=DriverManager.getConnection("jdbc:odbc:abc");
		 PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
	 while(msg.equals("yes"))
	 {
		 System.out.println("\nEnter Id:");
		 int id=sc.nextInt();
		 System.out.println("\nEnter Name:");
		 String n=sc.next();
		 System.out.println("\nEnter Salary:");
		 float s=sc.nextFloat();
		 pst.setInt(1,id);
		 pst.setString(2,n);
		 pst.setFloat(3,s);
		 int r=pst.executeUpdate();
		 System.out.println("\n"+r+" records Inserted");
		 System.out.println("\nDo u want to continue?");
		 msg=sc.next();
	 }
	 pst.close();
	 con.close();
   }
 }   
	 