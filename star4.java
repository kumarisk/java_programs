class star4
{
public static void main(String args[])
{
int i,j,t=1;
for(i=1;i<=5;i++)
{
for(int k=5;k>i;k--)
{
System.out.print(" ");                                                                                       
}
for(j=1;j<=t;j++)
{
System.out.print("*");
}
System.out.print("\n");
t=t+2;
  }
t=7;
for(i=2;i<=5;i++)
{
for(int k=1;k<i;k++)
{
System.out.print(" ");                                                                                       
}
for(j=1;j<=t;j++)
{
System.out.print("*");
}
System.out.print("\n");
t=t-2;
  }

}
}