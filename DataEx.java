/*copy constructor*/
class Data
{
    private int d;
    public Data(int d1)
    {
      d=d1;
    }
   public Data(Data d1)
   {
       d=d1.d;
    }
 public void showData()
{
   System.out.print("\n"+d);
}
}
class DataEx
{
   public static void main(String args[])
   {
       Data d1=new Data(10);
      System.out.print("Data of D1:");
      d1.showData();
      Data d2=new Data(d1);
      System.out.print("\nData of D2:");
      d2.showData();
}
}
      

    

  
