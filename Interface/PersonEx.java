interface Person
{
  public void info();
}
class Student implements Person
{
	private int roll;
	private String name;
	public Student(int r,String n)
	{
		roll=r;
		name=n;
		
	}
	public void info()
	{
		 System.out.println("\nRoll:"+roll+"\tName="+name);
	
	}
	
}
class Employee implements Person
{
	private int id;
	private String name;
	public Employee(int i,String n)
	{
		id=i;
		name=n;
	}
	public void info()
	{
		System.out.println("\nId="+id+"\tName="+name);
	}
}
class PersonEx
{
	public static void main(String args[])
	{
		Student s=new Student(101,"AAAA");
		Employee e=new Employee(202,"BBB");
		System.out.println("\nInfo of Student");
		s.info();
		System.out.println("\nInfo of Employee");
		e.info();
	}
}