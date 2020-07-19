import java.util.*;
class ArrayInput
{
    public static void main(String args[])
    {
       int a[]=new int[5];
       int i;
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter Array Elements:");
        for(i=0;i<a.length;i++)
          a[i]=sc.nextInt();
       System.out.println("\nArray elements\n");
       for(int x:a)
       System.out.println(" "+x);
    }
}

      