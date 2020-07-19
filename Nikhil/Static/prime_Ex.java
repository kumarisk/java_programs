class prime
{
private static int n;
private static int count=0;
  public static void get(int n1)
  {
    n=n1;
  }
  public static void cal()
  {
	for(int i=1;i<=n;i++)
	if(n%i==0)
	   count++;
  }
  public static void display()
  {
     if(count==2)
    System.out.println(n+" is prime");
	else
	System.out.println(n+" is composite");
  }
}
class prime_Ex
{
public static void main(String args[])
  {
    prime.get(5);
	prime.cal();
	prime.display();
  }
}