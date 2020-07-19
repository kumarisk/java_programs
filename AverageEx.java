/*Parameterised Constructor*/
import java.util.*;
class Number
{
    private int n1,n2,n3;
    public Number(int n1,int n2,int n3)
     {
       this.n1=n1;
       this.n2=n2;
       this.n3=n3;
    }
    public void showResult()
    {
      System.out.println("\nN1="+n1+"  N2="+n2+"  N3="+n3);
      System.out.print("\nTotal="+(n1+n2+n3));
      System.out.println("  Average:"+(n1+n2+n3)/3.0f);
   }
}
class AverageEx
{
   public static void main(String arg[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter three numbers:");
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      Number n=new Number(n1,n2,n3);
      n.showResult();
  }
}