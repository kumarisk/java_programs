class A
{
   protected int a;
   public void getA(int a)
   {
     this.a=a;
   }
}
class B extends A
{
   protected int b;
   public void getB(int b)
   {
     this.b=b;
   }
}
class C extends B
{
   private int c;
   public void getC(int c)
   {
     this.c=c;
   }
  public void getABC()
  {
     System.out.println("\nA="+a+"\tB="+b+"\tC="+c);
  }
}
class ABC
{
   public static void main(String args[])
  {
     C c=new C();
     c.getA(100);
     c.getB(200);
     c.getC(300);
     c.getABC();
  }
}