class Student1
{
	private int roll;
	private String name;
	public float per;
	
	public void getInfo(int r,String n,float p)
{
	roll=r;
	name=n;
	per=p;
}
	public void showInfo()
{
	System.out.println("\nRoll no:"+roll);
	System.out.println("\nName:"+name);
	System.out.println("\nPer:"+per);
}
}
	class StudentEx
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Student1 s1  =new Student1();
	Student1 s2 =new Student1();
	s1.getInfo(1,"aaa",78);
	s2.getInfo(2,"ccc",87);
	if(s1.per>s2.per)
	s1.showInfo();
	else
	s2.showInfo();
	}
}

	