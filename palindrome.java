class palindrome
{
public static void main(String args[])
{
int i=Integer.parseInt(args[0]);
int rev=0,j,r,a;
a=i;
for(;a>0;)
{
r=a%10;
rev=rev*10+r;
a=a/10;
}
if(rev==i)
System.out.println(i+ " is Palindrome");
else
System.out.println(i+ " is Not Palindrome");
}
}