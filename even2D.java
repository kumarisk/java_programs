class even2D
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,k=0,sum;
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
System.out.println("The even elements in array are:\n");
for(i=0;i<a.length;i++)
    for(j=0;j<a[i].length;j++)
         if(a[i][j]%2==0)
         System.out.print(a[i][j]+" ");
}
}