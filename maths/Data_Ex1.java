/*Returning Object from function*/
class Data
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
    public Data add(Data d2)
   {
         Data d3=new Data();
          d3.n=n+d2.n;
          return d3;
   }
}
class Data_Ex1
{
     public static void  main (String ars[])
   {
          Data d1,d2,d3;
          d1=new Data();       
          d2=new Data();
          d3=new Data(); 
          d1.getN(5);
          d2.getN(10);
      
          d3=d1.add(d2);
          System.out.print("Data of D1:");
          d1.showN();
          System.out.print("Data of D2:");
          d2.showN();
          System.out.print("Addition of D1 and D2:");
          d3.showN();
}
}
 