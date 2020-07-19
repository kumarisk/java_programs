/*using new operator*/
class Input
{
    public static void main(String args[])
    {
        int len=args.length;
        int a[]=new int[len];
        for(int i=0;i<a.length;i++)
       {
         a[i]=Integer.parseInt(args[i]);
      }
     System.out.println("\nElements of Array:\n");
        for(int i=0;i<a.length;i++)
          System.out.print(" "+a[i]);
    }
}