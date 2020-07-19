 /*super keyword in Hierarchical Inhetirance*/
 class Person
 {
	protected String name;
	public void getName(String name)
	{
		 this.name=name;
	}
 }
class Student extends Person
{
   private String name;
   public void getName(String nm1,String nm2)   
   {
	      super.getName(nm1);
		  name=nm2;
   }
   public void showName()
   {
      System.out.println("\nName of Person="+super.name);
	  System.out.println("\nName of Student:"+name);
   }
}
class Worker extends Person
{
	 private String name;
	 public void getName(String nm1,String nm2)
	 {
		  super.getName(nm1);
		  name=nm2;
     }
   public void showName()
   {
      System.out.println("Name of Person:"+super.name);
      System.out.println("\nName of Worker:"+name);
   }
}
class PersonEx
{
  public static void main(String args[])
  {
     Student s=new Student();
     Worker w=new Worker();
     s.getName("ABC","AAA");
     w.getName("PQR","PPP");
     s.showName();
     w.showName();
  }
}  
		  
   
     	 