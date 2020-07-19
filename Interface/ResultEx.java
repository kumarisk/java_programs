class Person
{
	protected String name,addrs;
	public void getPerson(String nm,String ad)
	{
		name=nm;
		addrs=ad;
	}
}
interface Student
{
	int roll=101;
	int s1=67,s2=54,s3=89,s4=78;
	public void showInfo();
}
class Result extends Person implements Student
{
    float per;
    public void getPer()
	{
      per=(s1+s2+s3+s4)/4.0f;		
    }	
	public void showInfo()
	{
		System.out.println("\nName="+name);
		System.out.println("\nAddress="+addrs);
		System.out.println("\nPer="+per);
	}
}
class ResultEx 
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.getPerson("ABC","Solapur");
		r.getPer();
		r.showInfo();
	}
}

