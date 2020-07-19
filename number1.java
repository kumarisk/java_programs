class number
{
public static void main(String args[])
{
int i,j,t=1;
one:for(i=1;i<5;i++)
{
two:for(j=1;j<5;j++)
{
System.out.print(" "+t);
t++;
if(i==j)
{
System.out.println();
continue one;
}
}
}

}
}
