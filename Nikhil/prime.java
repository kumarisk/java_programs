class prime 
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int count=0,i;
for(i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
}
for(i=0;i<len;i++)
{
count=0;
for(int j=1;j<=a[i];j++)
{
if(a[i]%j==0)
count++;
}
if(count==2)
System.out.print(a[i]+" is prime\n");
else
System.out.print(a[i]+" is composite\n");
}
}
}