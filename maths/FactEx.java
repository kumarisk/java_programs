/*Returning argument from method*/
import java.util.*;
class Factorial
{
      private int n;
      private int fact;
      public void getNo(int no)
      {
            n=no;
      }
      public int getFact()
     {
          fact=1;
           for(int i=1;i<=n;i++)
               fact=fact*i;
            return fact;
      }
}
class FactEx
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("\nenter no:");
         int n=sc.nextInt();
         Factorial f=new Factorial();
         f.getNo(n);
         int result=f.getFact();
        System.out.println("\nFactorial="+result);
    }
}  
             
      
