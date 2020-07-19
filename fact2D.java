class fact2D
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,k=0,fact;
int b[][]=new int[3][3];
for(i=0;i<a.length;i++)
{
    for(j=0;j<a[i].length;j++)
       {
         a[i][j]=Integer.parseInt(args[k]);
          k++;
         System.out.print(a[i][j]+" ");
        }
System.out.print("\n");
}
System.out.println("Factorial of matrix is:\n");
for(i=0;i<a.length;i++)
{ 
    for(j=0;j<a[i].length;j++)
         {
             fact=1;
             for(k=1;k<=a[i][j];k++)
             fact=fact*k; 
             System.out.print(fact+" ");         
          }
     System.out.print("\n");
}
}
}