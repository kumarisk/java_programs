class Number
{
	protected int no;
	public void getNo(int n)
	{
		no=n;
	}
	public void showNo()
	{
		System.out.print("\nNo="+no);
	}
}
class Factorial extends Number
{
	private int fact;
	public void getFact()
	{
		fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
	}
	public void showResult()
	{
		System.out.print("\nFactorial="+fact);
	}
}
class NumFact
{
public static void main(String args[])
{
   Factorial f=new Factorial();
   f.getNo(5);
   f.getFact();
   f.showNo();
   f.showResult();
}
}