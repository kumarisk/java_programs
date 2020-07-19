import java.util.*;
class Student
{
     private int roll;
     private String name;
     private float per;
     public Student(int r,String n,float p)
     {
        roll=r;
        name=n;
        per=p;
     }
    public void display()
    {
        System.out.print(roll);
        System.out.print("\t"+name);
        System.out.print("\t"+per+"\n");
     }
}
class StudentEx
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       Student s[]=new Student[5];
       for(int i=0;i<s.length;i++)
        {
            System.out.println("\nEnter Roll No Name and Per:");
           int r=sc.nextInt();
           String nm=sc.next();
           float p=sc.nextFloat();
           s[i]=new Student(r,nm,p);
        }
   /*   System.out.println("\nRoll\tName\tPer");
       for(int i=0;i<s.length;i++)
       {
           s[i].display();
       }*/
     System.out.println("\nInformation of Students using Enhanced for loop");
     for(Student x:s)
      {
           x.display();
      }
}
}
 