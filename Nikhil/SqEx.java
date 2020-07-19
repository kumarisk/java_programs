class Square
{
	public void sq(int a)
	{
		System.out.print("\nSquare="+(a*a));
	}
	public void sq(float a)
	{
		System.out.print("\nSquare="+(a*a));
	}
	public void sq(double a)
	{
		System.out.print("\nSquare="+(a*a));
	}
}
class SqEx
{
	public static void main(String args[])
	{
		Square s1=new Square();
		s1.sq(10);
		s1.sq(12.5);
		s1.sq(10);
	}
}