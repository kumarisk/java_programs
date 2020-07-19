interface Person
{
	String name,addr;
	public void Info();
}
class Student implements Person
{
	private int roll;
	private float per;
	public Student(String nm,String ad,int r,float p)
	{
		name=nm;
		addr=ad;
		roll=r;
		per=p;
	}
	public void Info()
	{
		System.out.print("\nName="+name);
		System.out.print("\nAddress="+addr);
		System.out.print("\nRoll="+roll);
		System.out.print("\nPercentage="+per);
	}
}
class Worker implements Person
{
	private int id;
	private float sal;
	public Worker(String nm,String ad,int i,float s)
	{
		name=nm;
		addr=ad;
		id=i;
		sal=s;
	}
	public void Info()
	{
		System.out.print("\nName="+name);
		System.out.print("\nAddress="+addr);
		System.out.print("\nRoll="+roll);
		System.out.print("\nPercentage="+per);
	}
}