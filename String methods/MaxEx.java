import java.util.*;
class Maxtest
{
    private int id;
    private float price;
    public void get(int i,float p)
    {
         id=i;
         price=p;
    }
    public void put()
    {
            System.out.print("Id="+id);
            System.out.print("\nprice="+price);
    }
  public void check(Maxtest m[])
   {
      int index=0;
      float max=0;
     for(int i=0;i<m.length;i++)
    {
         if(max<m[i].price)
        {
           max=m[i].price;
           index=i;
       }
    }
     System.out.println("\nInformation of Product having Maximum price:");
     m[index].put();
  }
}        
class MaxEx
{
      public static void main(String args[])
      {
          Maxtest m[]=new Maxtest[5];
          float max=0;
         int index=0;
          Scanner sc=new Scanner(System.in);
       for(int i=0;i<m.length;i++)
       {
            m[i]=new Maxtest();
            System.out.println("\nEnter Id and Price:");
            int id=sc.nextInt();
            float p=sc.nextFloat();
            m[i].get(id,p);
     }
     m[0].check(m);
 /*  for(int i=0;i<m.length;i++)
    {
         if(max<m[i].price)
        {
           max=m[i].price;
          index=i;
       }
    }
   System.out.println("\nInformation of Product having Maximum price:");
     m[index].put();*/
  }
} 