class prime
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];

for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
System.out.println("array:"+a[i]);
}

for(int j=0;j<len;j++)
{
a[j]=a[j]*a[j];
System.out.println("square or array"+a[j]);
}

}
}