class star1
{
public static void main(String args[])
{
int i,j;
one:for(i=5;i>=1;i--)
{
two:for(j=5;j>=1;j--)
{
System.out.print("* ");

if(i==j)
{
System.out.println();
break two;
}
}
}

}
}
