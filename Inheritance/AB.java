class A
{
    protected  int no;
    public void showNo()
   {
     System.out.println("No of A class="+no);
   }
}
class B exyends A
{
    private int no;
    public void getNo(int a,int b)
   {
       super.no=a;
       no=b;
  }
  public void showNo()
 {
    super.showNo();
    System.out.println("\nNo of B class="+no);
    }
}
class AB
{
   public static void main(String args[])
   {
      B b=new B();
      b.getNo(100,200);
      b.showNo();
   }
}