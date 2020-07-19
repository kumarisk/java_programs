class Person
{
     public void info()
    {
      System.out.println("\nInformation of Person");
    }
}
class Student extends Person
{
     private int roll;
     private String name;
     private float per;
     public Student(int r,String nm,float p)
    {
      roll=r;
      name=nm;
      per=p;
    }
   public void info()
    {
      System.out.println("\nRoll no:"+roll);
      System.out.println("\nName:"+name);
      System.out.println("\nPer:"+per);
    }
}
class Employee extends Person
{
    private int id;
    private String name;
    private float sal;
    public Employee(int i,String nm ,float p)
    {
      id=i;
      name=nm;
      sal=p;
    }
   public void info()
   {
      System.out.print("Id:"+id);
     System.out.println("Name:"+name);
     System.out.println("Sal:"+sal);
  }
}
class PersonEx
{
    public static void main(String arsg[])
    {
       Person p;
       p=new Student(1,"AAA",65.89f);
       System.out.println("\nInfo of Student:");
       p.info();
       p=new Employee(2,"BBB",7000.0f);
       System.out.println("\nInfo of Employee:");
       p.info();
  }
}
   
   