class A
{
   public final void show()
   {
      System.out.println("\nFrom class A");
   }
   public void display()
   {
      System.out.println("\nFrom method display");
   }
}
class B extends A
{
   public void display()
   {
      System.out.println("\nFrom class B");
   }
   public void show()
   {
      System.out.println("\nFrom method Show");
   }
   //error occures bcs of final method overiding
}
class ABEx1
{
   public static void main(String args[])
   {
      B b=new B();
	  b.show();
	  b.display();
   }
}