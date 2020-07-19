package std;
public class Student
{
   private int roll;
   private String name;
   public Student(int r,String n)
   {
      roll=r;
	  name=n;
   }
   public void display()
   {
      System.out.println("\nRoll="+roll);
	  System.out.println("\nName="+name);
   }
}