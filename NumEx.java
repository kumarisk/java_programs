class Number
{
   private int n;
   public Number(int n)
  {
    this.n=n;
  }
  public void showN()
   {
     System.out.println("\nN="+n);
   }
}
class NumEx
{
   public static void main(String args[])
   {
     Number n=new Number(10);
     n.showN();
    }
}