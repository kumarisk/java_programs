/*super method in multilevel Inheritance*/
class A
{
   protected int a;
   public A(int a)
  {
     this.a=a;
   }
  public void showA()
  {
    System.out.println("\nA="+a);
  }
}
class B extends A
{
   protected int b;
   public B(int a,int b)
    {
      super(a);
      this.b=b;
    }
   public void showB()
   {
     System.out.println("\nB="+b);
   }
}
class C extends B
{
   private int c;
   public C(int a,int b,int c)
   {
      super(a,b);
      this.c=c;
   }
   public void showC()
   {
     System.out.println("\nC="+c);
  }
}
class ABCEx
{
   public static void main(String args[])
  {
      C c1=new C(101,202,303);
      c1.showA();
      c1.showB();
      c1.showC();
   }
}