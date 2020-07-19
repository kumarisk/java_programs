/*overiding show() method*/
class A
{
    public void show()
   {
     System.out.println("\nFrom A");
   }
}
class B extends A
{
   public void show()
   {
      System.out.println("\nFrom B");
  }
}
class AB_Ex
{
    public static void main(String arg[])
  {
      B b=new B();
      b.show();
   }
} 