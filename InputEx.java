class InputEx
{
    public static void main(String args[])
   {
       int a[][]={{5,6,8},{4,5,8},{5,8,2}};
       System.out.println("\nArray elements \n");
       for(int x[]:a)
      {
          for(int y:x)
          {
             System.out.print(" "+y);
           }
          System.out.println("\n");
     }
 }
}