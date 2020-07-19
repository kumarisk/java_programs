abstract class Person
{
   public abstract void info();
}
class Student extends Person
{
    public void info()
	{
       System.out.println("\nFrom Student class....");
	}
}
class Employee extends Person
{
    public void info()
	{
	   System.out.println("\nFrom Employee class");
	}
}
class Person_Ex
{
   public static void main(String args[])
   {
      Student s=new Student();
	  Employee e=new Employee();
	  s.info();
	  e.info();
   }
}