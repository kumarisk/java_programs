/*Write a function to overload area to calcultae area of circle,area of triangle
area of rectangle*/
class Area
{
    public int area(int l,int b)
    {
          return(l*b);
     }
  public void area(float r)
   {
     System.out.println("\nArea of Circle:"+(3.14*r*r));
   }
  public void area(float b,float h)
   {
     System.out.println("\nArea of Triangle:"+(0.5*b*h));
   }
}
class AreaEx
{
    public static void main(String args[])
    {
       Area a=new Area();
       System.out.println("\nArea of Rectangle:"+a.area(10,20));
       a.area(20.0f);
       a.area(3.5f,7.8f);
    }
}