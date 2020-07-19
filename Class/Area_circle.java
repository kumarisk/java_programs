import java.util.*;
class circle
{
 private float radius;
 private double area;
 public void get()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter radius of a circle: ");
       radius=sc.nextFloat();
       area=Math.PI*Math.pow(radius,2);
     }
 public void show()
    {
       
       System.out.println("Radius="+radius);
       System.out.println("Area="+area);
     }
}
class Area_circle
{
public static void main(String args[])
{
circle c=new circle();
c.get();
c.show();

}
}