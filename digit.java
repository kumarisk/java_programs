class digit
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
if(a<10)
System.out.println("one digit");
else if(a<100)
System.out.println("two digit");
else if(a<1000)
System.out.println("three digit");
else
System.out.println("out of range");
}
}