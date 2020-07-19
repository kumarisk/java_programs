class minmax
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int max=0,min,i;
for(i=0;i<len;i++)
{
a[i]=Integer.parseInt(a[i]);
}
min=a[0];
for(i=0;i<len;i++)
{
if(a[i]>max)
max=a[i];
if(a[i]<min)
min=a[i];
}
System.out.println("Min="+min);
System.out.println("Max="+max);
}
}