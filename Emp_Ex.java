/*Default Constructor*/
class Employee
{
   private int id;
   private String name;
   private float sal;
   public Employee()
   {
      id=1;
      name="AAA";
      sal=6000.0f;
    }
   public void display()
   {
      System.out.println("\nId:"+id);
      System.out.println("\nName:"+name);
      System.out.println("\nSalary:"+sal);
   }
}
class Emp_Ex
{    
   public static void main(String args[])
   {
      Employee emp=new Employee();
      emp.display();
   }
}