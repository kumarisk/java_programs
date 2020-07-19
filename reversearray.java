class reversearray
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int b[]=new int[len];
int j;
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
System.out.println("array A:"+a[i]);

}
j=a.length-1;
for(int i=0;i<len;i++)
{
b[i]=a[j];

j--;

}
for(j=0;j<len;j++)
System.out.println("array B:"+b[j]);
}
}