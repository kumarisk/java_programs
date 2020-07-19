class Series_Ex
{
      public static void main(String args[])
     {
          int i,j;
          one:for(i=1;i<=10;i++)
                 {
                     two:for(j=1;j<=10;j++)
                             {
                                System.out.print(" "+j);
                                 if(i==j)
                                {
                                      System.out.print("\n");
                                     continue one;
                                }
                             }
                
                }
     }
}