class fact
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int fact=1;
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
System.out.println("array:"+a[i]);
}
System.out.println("Factorial of each elements in the array");
for(int i=0;i<len;i++)
{
fact=1;
for(int j=1;j<a[i];j++)
{
fact=fact*j;
}
System.out.println(a[i]+"fact is"+fact);
}

}
}