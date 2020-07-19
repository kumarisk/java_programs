/*using new operator*/
class TwoDArrayEx
{
     public static void main(String args[])
     {
         int a[][]=new int[3][3];
         int i,j,k=0;
         for(i=0;i<a.length;i++)
         {
            for(j=0;j<a[i].length;j++)
            {
                  a[i][j]=Integer.parseInt(args[k]);
                   k++;
             }
         }
      System.out.println("\nArray Elements\n");
      for(i=0;i<a.length;i++)
         {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(" "+a[i][j]);
            }
           System.out.println("\n");
        }
  }
} 