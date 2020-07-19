/*Creating reference to an abstract class(Dynamic polymorphism)*/
abstract class A
{
   public abstract void show();
}
class B extends A
{
  public void show()
  {
     System.out.println("\nFrom B");
  }
}
class C extends A
{
   public void show()
   {
     System.out.println("\nFrom C");
   }
}
class ABC_Ex
{
   public static void main(String args[])
   {
       A a;
	   a=new B();
	   a.show();
	   a=new C();
	   a.show();
   }
}
