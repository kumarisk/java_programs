class max2Drow
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,k=0,max=0;
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
System.out.print("The max in array is:");
for(i=0;i<a.length;i++)
{
max=0;
    for(j=0;j<a[i].length;j++)
         if(a[i][j]>max) 
             max=a[i][j];
System.out.print("\nMax="+max);
}
}
}