class star
{
public static void main(String args[])
{
int i,j;
one:for(i=1;i<=5;i++)
{
two:for(j=5;j>=1;j--)
{
System.out.print(" "+"*");

if(i==j)
{
System.out.println();
break two;
}
}
}

}
}
