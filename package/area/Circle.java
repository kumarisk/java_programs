package area;
public class Circle
{
    private int r;
	public Circle(int r)
	{
	   this.r=r;
	}
	public void getArea()
	{
	   System.out.println("\nRadius="+r);
	   System.out.println("\nArea="+(3.14f*r*r));
	}
}
