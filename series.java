class series
{
  public static void main(String args[])
  {
	int a=Integer.parseInt(args[0]);
	int i,sum=0;
	for(i=0;i<=a;i++)
	{
		sum=sum+(i*i);
	}
	System.out.println("Sum="+sum);
  }
}