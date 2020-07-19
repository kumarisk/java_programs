class addition2D
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,k=0,sum=0;
int b[][]=new int[3][3];
int c[][]=new int[3][3];
System.out.print("First array:\n");
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
System.out.print("Second array:\n");
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
System.out.print("Result array:\n");
for(i=0;i<a.length;i++)
   {
    for(j=0;j<a[i].length;j++)
         {
            c[i][j]=a[i][j]+b[i][j];
            System.out.print(c[i][j]+" ");
           }
     System.out.print("\n");
    }
}
}