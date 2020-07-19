class enhanced
{
    public static void main(String args[])
    {
	int len=args.length;
	int a[]=new int[len];
	int b[]=new int[len];
	int i,max=0,smax=0;
	for(i=0;i<len;i++)
	{
		a[i]=Integer.parseInt(args[i]);
	}
	for(int x:a)
	{
		if(x>max)
		max=x;
	}
	for(int x:a)
	{
		if(x>smax&&x!=max)
		smax=x;
	}
	System.out.print(max+" "+smax);
    }
}