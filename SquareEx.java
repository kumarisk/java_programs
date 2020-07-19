class Square
{
	public int sq(int a)
{
	return(a);
}
	public void sq(float a)
{
	System.out.println("\nSquare:"+(a*a));
}
	public void sq(double a)
{
	System.out.println("\nSquare:"+(a*a));
}
}
class SquareEx
{
	public static void main( String args[])
{
	Square sq1=new Square();

	sq1.sq(10);
	sq1.sq(10.05f);
	sq1.sq(4.5f);
}
}