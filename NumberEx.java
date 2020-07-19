 class Number
{
    private int n;
    public void getNo(int n)
    {
        this.n=n;
     }
   public void showNo()
    {
          System.out.println("\nNo:"+this.n);
    }
}
class NumberEx
{
   public static void main(String args[])
  {
      Number n1=new Number();
      Number n2=new Number();
      n1.getNo(10);
      n1.showNo();
 
  }
}