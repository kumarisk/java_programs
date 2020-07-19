class five
{
public static void main(String args[])
{
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  int c=Integer.parseInt(args[2]);
  int d=Integer.parseInt(args[3]);
  int e=Integer.parseInt(args[4]);
if(a>b && a>c&&a>d&&a>e)
System.out.println(a+" is greater");
else if(b>c && b>d&&b>e)
System.out.println(b+" is greater");
else if(c>d && c>e)
System.out.println(c+" is greater");
else if(d>e)
System.out.println(d+" is greater");
else
System.out.println(e+" is gerater");
}
}