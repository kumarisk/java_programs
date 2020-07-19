/*Compare two objects*/
import java.util.*;
class Compare 
{
   private int n;
   public void getData(int a)
    {
       n=a;
    }
   public void showData()
    {
        System.out.println("\nN="+n);
    }
   public Compare check(Compare c2)
   {
        Compare c3=new Compare();
         if(n>c2.n)
          c3.n=n;
         else
         c3=c2;
     return c3;
   }
}
class CompareEx
{
    public static void main(String args[])
   {
       Compare c1=new Compare();
       Compare c2=new Compare();
       c1.getData(10);
       c2.getData(15);
       Compare c3=c1.check(c2);
       System.out.println("\nLargest N:");
       c3.showData();
   }
}