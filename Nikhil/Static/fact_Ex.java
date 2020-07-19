class fact
{
private static int n;
private static int fact=1;
  public static void get(int n1)
  {
    n=n1;
  }
  public static void cal()
  {
	for(int i=1;i<=n;i++)
	fact=fact*i;
  }
  public static void display()
  {
    System.out.println("Factorial="+fact);
  }
}
class fact_Ex
{
public static void main(String args[])
  {
    fact.get(5);
	fact.cal();
	fact.display();
  }
}