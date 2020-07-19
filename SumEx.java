/*
to find sum of array of size 3X3*/
class SumEx
{
    public static void main(String args[])
   {
      int a[][]=new int[3][3],i,j,k=0,sum=0;
      for(i=0;i<a.length;i++)
     {
       for(j=0;j<a[i].length;j++)
        {
             a[i][j]=Integer.parseInt(args[k]);
              k++;
        }
    }
  for(i=0;i<a.length;i++)
     {
        for(j=0;j<a[i].length;j++)
        {
            sum=sum+a[i][j];
               System.out.print(" "+a[i][j]);
       }
       System.out.print("\n");
   }
  System.out.println("\nsum="+sum);
  }
}
