/*overloaded constructor*/
class Number
{
    private int n1,n2;
    public Number()
    {
      n1=10;
      n2=20;
    }
   public Number(int x)
   {
     n1=x;
     n2=x;
   }
   public Number(int x,int y)
   {
       n1=x;
       n2=y;
   }
  public void showNo()
   {
      System.out.println("\nNo1:"+n1);
      System.out.println("No2:"+n2);
   }
}
class Num_Ex
{
   public static void main(String args[])
   {
      Number n1=new Number();
     System.out.print("Data of N1:");
     n1.showNo();
    Number n2=new Number(200);
    System.out.print("Data of N2:");
    n2.showNo();
    Number n3=new Number(30,40);
    System.out.print("Data of N3:");
    n3.showNo();
  }
}
     


      
    
    

  