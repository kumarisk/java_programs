import info1.Info;
class InfoEx
{
	  
   public static void main(String args[])
   {
       Info in=new Info();
	   in.show();
	   info2.Info in1=new info2.Info();
	   in1.show();
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("\nEnter No:");
	   int n=sc.nextInt();
	   System.out.println("\nNo="+n);
   }
}