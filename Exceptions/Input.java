import java.util.Scanner;
class Input
{
  public static void main(String args[])
  {
     int a=0;
	 int b=0;
	 float c=0;
	 Scanner sc=new Scanner(System.in);
	 String msg="yes";
	 while(msg.equals("yes"))
	 {
	    System.out.println("\nEnter A:");
		a=sc.nextInt();
		System.out.println("\nEnter B:");
		b=sc.nextInt();
		try
		{
		  c=a/b;
		 System.out.println("\nA="+a);
	   	 System.out.println("\nB="+b);
		 System.out.println("\nResult="+c);
		}
		catch(Exception e)
		{
		   System.out.println("\nDivide by Zero not allowed");
		   System.out.println("\nPls re-enter Numbers");
		}
		System.out.println("\nDo u want to continue ? ");
		msg=sc.next();
	  }
  }
}