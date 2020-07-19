class enhanced
{
    public static void main(String args[])
    {
	int len=args.length;
	int a[]=new int[len];
	int b[]=new int[len];
	int i;
	for(i=0;i<len;i++)
	{
		a[i]=Integer.parseInt(args[i]);
	}
	i=0;
	for(int x:a)
	{
		b[i]=x*x;
		i++;
	}
	System.out.print("Square of each elements\n");
	for(int y:b)
	{
		System.out.print(y+" ");
	}
    }
}