class Student
{
    private int roll;
    private String name;
    private float per;
    public Student()
    {
        roll=4;
        name="AAA";
        per=67.0f;
   }
  public Student(int r,String n,float p)
  {
       roll=r;
       name=n;
       per=p;
   }
  public void display()
   {
       System.out.print(roll+"\t"+name+"\t"+per+"\n");
  }
}
class Stud
{
   public static void main(String args[])
   {
      Student s[]={new Student(1,"abc",78),new Student(2,"xyz",98),new Student      (3,"lmn",78),new Student()};
     System.out.println("\nroll\tName\tPer\n");
    for(Student x:s)
    x.display();
  }
}