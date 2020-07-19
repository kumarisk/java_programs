class Number
{
	protected int no;
	public void getNo(int n)
	{
	no=n;
	}
	public void ShowNo()
	{
	System.out.print("\nNumber="+no);
	}
}
class Factorial extends Number
{
	private int fact=1,i;
	public void getFact()
	{
		for(i=1;i<=no;i++)
		fact=fact*i;	
	}
	public void showResult()
	{
	System.out.println("Factorial="+fact);
	}
}
class NumFact
{
	public static void main(String args[])
	{
	Factorial f=new Factorial();
	f.getNo(5);
	f.getFact();
	f.ShowNo();
	f.showResult();
	}
}
