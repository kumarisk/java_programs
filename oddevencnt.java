class oddevencnt
{
public static void main(String args[])
{
int len=args.length;
int a[]=new int[len];
int odd=0,even=0;
for(int i=0;i<len;i++)
{
a[i]=Integer.parseInt(args[i]);
if(a[i]%2==0)
even++;
else odd++;
}
System.out.println("Odd elements in array are="+odd);
System.out.println("Even elements in array are="+even);
}
}