class maxmin
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int max=0,min;
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
}
min=a[2];
for(int i=0;i<len;i++)
{
while(a[i]>max)
max=a[i];
while(a[i]<min)
min=a[i];
}
System.out.println("max="+max);
System.out.println("min="+min);
}
}