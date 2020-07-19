class ArrayMul2D
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,k=0,fact,sum;
int b[][]=new int[3][3];
int c[][]=new int[3][3];
System.out.println("First Array\n");
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
System.out.println("Second Array\n");
for(i=0;i<b.length;i++)
{
    for(j=0;j<b[i].length;j++)
       {
         b[i][j]=Integer.parseInt(args[k]);
          k++;
         System.out.print(b[i][j]+" ");
        }
System.out.print("\n");
}
System.out.println("Multiplication of matrices is:\n");
for(i=0;i<a.length;i++)
{ 
    for(j=0;j<a[i].length;j++)
         {
                 sum=0;
                 for(k=0;k<a[i].length;k++)
                    {
                       sum=sum+(a[i][j]*b[j][i]);
                       c[i][j]=sum;
                     }
                 System.out.print(sum+" ");         
         }
     System.out.print("\n");
}
}
}