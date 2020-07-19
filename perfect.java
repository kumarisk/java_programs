class perfect
{
  public static void main(String args[])
  {
	int a=Integer.parseInt(args[0]);
	int sum=0;
	for(int i=1;i<a;i++)
	{
		if(a%i==0)	
		sum=sum+i;	
	}
	if(a==sum)
	System.out.println(a+" is perfect no");
	else
	System.out.println(a+" is not perfect no");
  }
}