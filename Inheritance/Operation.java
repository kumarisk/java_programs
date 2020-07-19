abstract class Number
{
     protected int n;
	 public abstract void result();
}
class Fact extends Number
{
  private int i,f=1;
  public Fact(int a)
  {
	 n=a;
  }
  public void result()  
  {
	  for(i=1;i<=n;i++)
		  f=f*i;
	  System.out.println("\nN="+n+"\tFact="+f);
  }
}
class EvenOdd extends Number
{
  public EvenOdd(int x)	
  {
	  n=x;
  }
  public void result()
  {
	  if(n%2==0)
		  System.out.println("\n"+n+" is Even Number");
	  else
		  System.out.println("\n"+n+" is Odd Number");
  }
}
class Operation
{
	 public static void main(String args[])
	 {
		 Number n;
		 n=new Fact(6);
		 n.result();
		 n=new EvenOdd(13);
		 n.result();
		 
	 }
}