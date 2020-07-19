/*creating information of Employee using this operator*/
import java.util.*;
class Employee
{ 
     private int id; 
     private String name;
     private float sal;
     public void getEmp(int id,String name,float sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
   public void showEmp()
   {
         System.out.println("\nId:"+id);
         System.out.println("\nName="+name);
         System.out.println("\nSalary:"+sal);
    }
}
class EmpEx
{
    public static void main(String args[])
   {
       Employee e=new Employee();
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter Id:");
       int i=sc.nextInt();
       System.out.println("\nEnter Name:");
       String nm=sc.next();
       System.out.println("\nEnter Salary:");
       float sal=sc.nextFloat();
       e.getEmp(i,nm,sal);
       e.showEmp();
   }
}
 