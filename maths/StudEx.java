/*Information of Student*/
import java.util.*;
class Student
{
   private int roll;
   private String name;
   private float per;
   public void getInfo(int r,String n,float p)
   {
          roll=r;
          name=n;
          per=p;
   }
   public void showInfo()
    {
       System.out.println("\nRoll no:"+roll);
       System.out.println("\nName="+name);
       System.out.println("\nPer="+per);
    }
}
class StudEx
{
     public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("\nenter Info of Student:");
          System.out.println("\nenter Roll No:");
          int r=sc.nextInt();
         System.out.println("\nenter Name:");
         String nm=sc.next();
         System.out.println("\nenter Per  No:");
         float per=sc.nextFloat();
         Student s=new Student();
         s.getInfo(r,nm,per);
         s.showInfo();
  }
}   

