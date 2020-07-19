class secondmin
{
    public static void main(String args[])
    {
	int len=args.length;
	int a[]=new int[len];
	int b[]=new int[len];
	int i,min,smin;
	for(i=0;i<len;i++)
	{
		a[i]=Integer.parseInt(args[i]);
	}
	min=a[0];
	smin=a[len-1];
	for(int x:a)
	{
		if(x<min)
		min=x;
	}
	for(int x:a)
	{
		if(x<smin&&x!=min)
		smin=x;
	}
	System.out.print(min+" "+smin);
    }
}