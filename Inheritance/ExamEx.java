class Person
{
   protected String name;
   protected String address;
   public void getPerson(String nm,String adr)
   {
       name=nm;
       address=adr;
    }
}
class Student extends Person
{
    protected int roll;
    protected int sub1,sub2,sub3;
    public void getStud(int r,int s1,int s2,int s3)
   {
      roll=r;
      sub1=s1;
      sub2=s2;
      sub3=s3;
   }
}
class Exam extends Student
{
   private float total,per;
    public void getMarks()
   {
      total=sub1+sub2+sub3;
      per=total/3.0f;
    }
   public void showInfo()
   {
      System.out.print("\nName="+name);
      System.out.print("\tAddress="+ address); 
      System.out.print("\nRoll No="+roll);
      System.out.print("\tSub1"+sub1);
      System.out.print("\tsub2="+sub2);
      System.out.print("\tSub3="+sub3);
      System.out.print("\nTotal="+total);
      System.out.println("\tPer="+per);
   }
}
class ExamEx
{
    public static void main(String args[])
  {
     Exam e=new Exam();
     e.getPerson("AAA","Solapur");
     e.getStud(101,65,78,56);
     e.getMarks();
     e.showInfo();
  }
}

    






/*Invoking super keyword in Multilevel Inheritance*/
class Number
 {
    protected int no;
    public void getNo(int n)
   {
      no=n;
   }
}
class Number_One extends Number
{
    protected int no1;
    public void getNo(int n1,int n2)
    {
      super.getNo(n1);
      no1=n2;
   }
}
class Number_Two extends Number_One
{
    private int no2;
    private int total;
    public getNo(int n1,int n2,int n3)
    {
       super.getNo(n1,n2);
       no2=n3;
    }
   public void getTotal()
   {
       total=no+no1+no2;
       System.out.println("\nTotal="+total);
   }
}
class Number_Ex
{
    public static void main(String args[])
   {
      Number_two two=new Number_Two();
      two.getNo(10,20,30);
      two.getTotal();
   }
}



































