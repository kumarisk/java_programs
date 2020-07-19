import java.util.*;
class Data 
{
   int n1;
   public void getN1(int n)
    {
           n1=n;
    }
   public void showN1()
   {
       System.out.println("\nN="+n1);
   }
 }
class DataEx
{
    public static void main(String args[])
   {
        Data d1=new Data();
        Data d2=new Data();
        d1.getN1(5);
        d2.getN1(10);
        System.out.println("\nLargest Dat:");
        if(d1.n1>d2.n1)
          d1.showN1();
        else
          d2.showN1();
     }
}

       