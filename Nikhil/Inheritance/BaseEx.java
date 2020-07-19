class Base
{
  protected int n1;
  public void getN1(int a)
  {
	   n1=a;
  }
}
class Sub1 extends Base
{
  protected int n2;	
  public void getN2(int b)
  {
     n2=b;
  }
  public void showN1N2()
  {
	   System.out.println("\nFrom Sub1 class:");
	   System.out.println("\nN1="+n1+"\tN2="+n2);
  }	   
}
class Sub2 extends Base
{
  protected int n3;
  public void getN3(int c)
  { 
    n3=c;
  }
  public void showN1N3()
  {
	   System.out.println("\nFrom Sub2 class:");
	   System.out.println("\nN1="+n1+"\tN3="+n3);
  }
}
class BaseEx
{
   public static void main(String args[])
   {
	  Sub1 s1=new Sub1();
      Sub2 s2=new Sub2();
	  s1.getN1(10); 
      s1.getN2(100);
	  s2.getN1(20);
	  s2.getN3(200);
	  s1.showN1N2();
	  s2.showN1N3();
   }  
}  