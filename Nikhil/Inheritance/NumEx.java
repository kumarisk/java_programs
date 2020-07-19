class Number
{
   protected int no;
   public void getNo(int n)
   {
	    no=n;
   }
}
class SquareRoot extends Number
{
	public void getResult()
	{
	   System.out.println("\nNo="+no+"\tSquare root="+Math.sqrt(no));
	}
}
class CubeRoot extends Number
{
	public void getResult()
	{
	   System.out.println("\nNo="+no+"\tCube root="+Math.cbrt(no));
	}
}
class NumEx
{
	public static void main(String args[])
	{
	   SquareRoot sq=new SquareRoot();
	   CubeRoot cb=new CubeRoot();
	   sq.getNo(25);
	   cb.getNo(81);
	   sq.getResult();
	   cb.getResult();
	}
}
	

	