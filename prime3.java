class prime1
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int temp=0;
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
System.out.println("array:"+a[i]);
}
for(int i=0;i<len;i++)
for(int j=i+1;j<len;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.println("array in ascending order");
for(int i=0;i<len;i++)
{
System.out.println("array:"+a[i]);
}
}
}