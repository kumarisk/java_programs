import java.util.*;
class Area
{
   public static void main(String args[])
   {
        int r;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Radius:");
        r=sc.nextInt();
        //area=3.14*r*r;
        area=Math.PI*Math.pow(r,2);
       System.out.println("\nR="+r);
       System.out.println("\nArea of Circle="+area);
    }
}