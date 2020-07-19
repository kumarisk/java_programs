class fact
{
  static int n1;
}
class fact_var
{
  public static void main(String args[])
{
fact.n1=5;
for(int i=1;i<=fact.n1;i++)
{
fact.n1=fact.n1*i;
}
System.out.println(" factorial="+fact.n1);
}
}