class Person
{
    private String name;
    private String mobile;
   public void getPerson(String nm,String m)
    {
       name=nm;
       mobile=m;
    }
    public void displayPerson() 
   {
     System.out.println("\nName="+name);
     System.out.println("\nMobile No="+mobile);
   }
}
class Student extends Person
{
   private int roll;
   private float per;
   public void getStudent(int r,float p)
    {
        roll=r;
        per=p;
    }
   public void displayStudent() 
   {
     System.out.println("\nRoll="+roll);
     System.out.println("\nPer="+per);
   }
}
class StudEx
{
  public static void main(String args[])
    {
      Student s=new Student();   
      s.getPerson("AAA","9890583909");
      s.getStudent(1,78.98f);
      s.displayPerson();
      s.displayStudent();
    }
}