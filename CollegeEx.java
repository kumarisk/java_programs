/*information of College using overloaded constructor*/
class College
{
     private String name;
     private String address;
     private int num_dept;
     public College(String nm,String adrs,int n)
    {
       name=nm;
       address=adrs;
       num_dept=n;
    }
  public College(int n,String nm,String adrs)
   {
      name=nm;
      address=adrs;
      num_dept=n;
   }
  public void showCollege()
  {
     System.out.println(name+"\t"+address+"\t\t"+num_dept);
  }
}
class CollegeEx
{
   public static void main(String args[])
   { 
       College c1=new College("WIT","solapur",20);
       College c2=new College(10,"Orchid","solapur");
       System.out.println("\nName\tAddress\tNumber of Dept");
       c1.showCollege();
       c2.showCollege();
    }
}