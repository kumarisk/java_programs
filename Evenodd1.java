class Evenodd1
{
	public static void main(String args[])
{
	int len=args.length;
	int a[]=new int[len];
	int  even,odd=0;
for(int i=0;i<len;i++)
{
	a[i]=Integer.parseInt(args[i]);
	if(a[i]%2==0)
	even++;
	else
	odd++;
}
System.out.println("even="+even);
System.out.println("odd="+odd);
}
}