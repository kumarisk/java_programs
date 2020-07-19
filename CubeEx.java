class Cube
{
	public int cu(int a)
{
	return(a);
}
	public void cu(float a)
{
	double res;	
	res=Math.cuberoot(a);
	System.out.println("\n Cuberoot:"+(a));
}
	public void cu(double a)
{
	double res;
	res=Math.cuberoot(a);
	System.out.println("\n Cuberoot:"+(a));
}
}
	class CubeEx
{
	public static void main(String args[])
{
	Cube c1=new Cube();

	c1.cu(19);
	c1.cu(10.05f);
	c1.cu(4.5f);
}
}