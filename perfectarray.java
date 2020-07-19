class perfectarray
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int j,sum=0;;
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
System.out.println("array :"+a[i]);
}
for(int i=0;i<len;i++)
{
sum=0;
for(j=1;j<a[i];j++)
{
if(a[i]%j==0)
sum+=j;
}
if(a[i]==sum)
System.out.println(a[i]+ "is Perfect no." );
else
System.out.println(a[i]+ "is not Perfect no." );

}
}
}