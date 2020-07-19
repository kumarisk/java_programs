interface Shape
{
   public void area();
}
class Circle implements Shape
{
     private int r;
	 private float aoc;
	 public Circle(int r)
	 {
	    this.r=r;
	 }
     public void area()
	 {
	     aoc=3.14f*r*r;
		 System.out.println("\nRadius="+r+"\tArea="+aoc);
	 }
}
class ShapeEx
{
     public static void main(String args[])
	 {
	     Circle c=new Circle(7);
		 c.area();
		 
	 }
}