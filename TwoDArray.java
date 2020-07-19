class TwoDArray
{
     public static void main(String args[])
    {
        int a[][]={{1,2,3},{5,6,7},{6,7,8}};
        int i,j;
        System.out.println("\nArray Elements\n");
         for(i=0;i<a.length;i++)
           {
              for(j=0;j<a[i].length;j++)
              {
                  System.out.print(" "+a[i][j]);
               }
              System.out.print("\n");
       }
   }  
}
          