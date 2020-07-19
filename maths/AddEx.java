/*Addition of three objects*/
import java.util.*;
class Addition
{
    private int n;
    public void getN(int a)
    {
        n=a;
    }
   public void showN()
   {
     System.out.println("\nN="+n);
    }
   public void add(Addition d2,Addition d3)
   { 
          int sum=n+d2.n+d3.n;
          System.out.println("sum="+sum);
   }
}
class AddEx
{
    public static void main(String args[])
    {
         Addition a1=new Addition();
         Addition a2=new Addition();
        Addition a3=new Addition();
         a1.getN(10);
         a2.getN(20);
         a3.getN(30);
         System.out.print("Data of D1:");
         a1.showN();
         System.out.print("Data of D2:");
        a2.showN();
         System.out.print("Data of D3:");
        a3.showN();
        a1.add(a2,a3);
    }
}

    
 
       