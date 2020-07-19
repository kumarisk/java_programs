class Shape
{
   public void area()
  {
     System.out.println("\nFrom Shape class");
   }
}
class Circle extends Shape
{
   private int r;
   private float aoc;
   public Circle(int a)
   {
      r=a;
   }
  public void area()
  {
     aoc=3.14f*r*r;
     System.out.println("\nRadius="+r);
     System.out.println("\nArea of Circle="+aoc);
   }
}
class Rectangle extends Shape
{
     private int len,base,aor;
     public Rectangle(int l,int b)
    {
        len=l;
        base=b;
    }
    public void area()
    {
       System.out.println("\nLength="+len);
       System.out.println("\nBase="+base);
       aor=len*base;
       System.out.println("\nArea of Rectangle="+aor);
    }
 }
class ShapeEx
{
    public static void main(String arsg[])
   {
      Circle c=new Circle(5);
      Rectangle r=new Rectangle(12,34);
      c.area();
      r.area();
   }
}  