/*Handling Exception using try-catch block*/
class Number_Ex
{
  public static void main(String args[])
  {
     int a=Integer.parseInt(args[0]);
	 int b=Integer.parseInt(args[1]);
	 float c=0;
	 try
	 {
	    c=a/b;
	 }
	 catch(ArithmeticException ae)
	 {
	  System.out.println("\nDivide by Zero Not Allowed");
	  //System.out.println(ae);
	  //ae.printStackTrace();
	 }
	 System.out.println("\nA="+a);
	 System.out.println("\nB="+b);
	 System.out.println("\nResult="+c);
   }
}