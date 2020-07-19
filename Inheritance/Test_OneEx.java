final class Test
{
  public void show()
  {
    System.out.println("\nshow method");
  }
}
class Test_One extends Test
{
   public void disp()
   {
      System.out.println("\ndisp method");
   }
}
class Test_OneEx
{
 public static void main(String args[])
 {
    Test_One one=new Test_One();
	one.show();
	one.disp();
 }
 
}