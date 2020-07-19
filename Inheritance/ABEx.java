class A
{
   private int a;
   /*public A()
   {
       System.out.println("From the Default Constructor of A");
   }*/
   public A(int a)
   {
      this.a=a;
    System.out.println("From the Parameterised Constructor of A");
      
   }
  public void showA()
   {
     System.out.println("\nA="+a);
   }
}
class B extends A
{
    private int b;
    public B(int a,int b)
   {
        //    super(); 
      super(a);
 
      this.b=b;
     System.out.println("From the Constructor of B");
   }
   public void showB()
   {
 //     super.showA();                          
     System.out.println("\nB="+b);
    }
}
class ABEx
{
   public static void main(String args[])
  {
      B b1=new B(100,200);
  //   b1.showA();
    b1.showB();
   }
}  
   