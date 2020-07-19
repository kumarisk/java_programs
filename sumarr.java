class sumarr
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int sum=0;
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
sum=sum+a[i];
}
System.out.println("sum="+sum);
}
}