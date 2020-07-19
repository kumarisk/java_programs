class Cube
{
	public void cu(int a)
	{
		double res;
		res=Math.cbrt(a);
		System.out.print("\nCuberoot="+res);
	}
	public void cu(float a)
	{
		double res;
		res=Math.cbrt(a);
		System.out.print("\nCuberoot="+res);
	}
	public void cu(double a)
	{
		double res;
		res=Math.cbrt(a);
		System.out.print("\nCuberoot="+res);
	}
}
class CubeEx
{
	public static void main(String args[])
	{
		Cube s1=new Cube();
		s1.cu(10);
		s1.cu(12.5);
		s1.cu(10);
	}
}