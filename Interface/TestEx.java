/*Interface can extends another Interface*/
interface Inter_One
{
  public void show1();
}
interface Inter_Two extends Inter_One
{
    public void show2();//show1();
}
interface Inter_Three extends Inter_Two
{
   public void show3();//show1()//show2();
}
class Test implements Inter_Three
{
   public  void show1()
   {
      System.out.println("\nFrom Show1....");
   }
   public  void show2()
   {
      System.out.println("\nFrom Show2....");
   }
   public  void show3()
   {
      System.out.println("\nFrom Show3....");
   }
}
class TestEx
{
   public static void main(String args[])
   {
       Test t=new Test();
	   t.show1();
	   t.show2();
	   t.show3();
   }
}