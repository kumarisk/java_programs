/*An abstract class implements interface*/
interface Person
{
   String name="AAAA";
   public void showInfo();
}
abstract class Student implements Person
{    
    protected  int roll;
	public void getroll(int r)
	{
	   roll=r;
	}
}
class StudInfo extends Student
{
  public void showInfo()
  {
     System.out.println("\nRoll:"+roll);
	 System.out.println("\nName:"+name);
  }
}	
class Stud_Ex
{
    public static void main(String args[])
	{
	  StudInfo s=new StudInfo();
	  s.getroll(101);
	  s.showInfo();
	}
}