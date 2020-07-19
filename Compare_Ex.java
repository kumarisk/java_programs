/*Compare two objects using this*/
import java.util.*;
class Compare 
{
   private int n;
   public void getData(int n)
    {
       this.n=n;
    }
   public void showData()
    {
        System.out.println("\nN="+n);
    }
   public Compare check(Compare c2)
   {
         if(n>c2.n)
           return this;
         else
         return c2;
  }
}
class Compare_Ex
{
    public static void main(String args[])
   {
       Compare c1=new Compare();
       Compare c2=new Compare();
       c1.getData(100);
       c2.getData(15);
       Compare c3=c1.check(c2);
       System.out.println("\nLargest N:");
       c3.showData();
   }
}