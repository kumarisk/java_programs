abstract class Shape
{
    public abstract void area();
}
class Circle extends Shape
{
   private int r;
   public Circle(int r)
   {
	   this.r=r;
   }
   public void area()
   {
	   System.out.println("\nRadius="+r);
	   System.out.println("\nArea="+(3.14f*r*r));
   }
}
class Square extends Shape
{
	  private int side;
	  public Square(int s)
	  {
		  side=s;
	  }
	  public void area()
	  {
		  System.out.println("\nSide="+side);
		  System.out.println("\nArea="+(side*side));
	  }
}
class Shape_Ex
{
	public static void main(String args[])
	{
		Circle c=new Circle(4);
		Square s=new Square(10);
		c.area();
		s.area();
	}
}