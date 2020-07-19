class number
{
public static void main(String args[])
{
int i,j;
one:for(i=5;i>=1;i--)
{
two:for(j=1;j<=5;j++)
{
System.out.print(" "+j);

if(i==j)
{
System.out.println();
break two;
}
}
}

}
}
