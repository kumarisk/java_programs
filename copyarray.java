class array
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int b[]=new int[len];
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
System.out.println("array A:"+a[i]);
}

for(int i=0;i<len;i++)
{
b[i]=a[i];
System.out.println("array B: "+b[i]);
}

}
}