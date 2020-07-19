class Bank
{
    private String name;
    private String address;
    public Bank(String nm,String adr)
    {
       name=nm;
       address=adr;
    }
   public void showBank()
    {
      System.out.println("\nName of Bank="+name);
      System.out.println("\nAddress of Bank="+address);
   }
}
class Employee extends Bank
{   
    private String type;
    private int acctno;
    private String custname;
    public Employee(String bnm,String baddr,String t,int no,String cm)
    {
       super(bnm,baddr);
       type=t;
       acctno=no;
       custname=cm;
    }
   public void showEmployee()
   {
      System.out.println("\nType="+type);
      System.out.println("\nAccount No:"+acctno);
      System.out.println("\ncutomer Name:"+custname);    
    }
}
class BankEx
{
   public static void main(String args[])
   {
      Employee e=new Employee("SBI","Solapur","Saving",1234567,"AAA");
     e.showBank();
     e.showEmployee(); 
   }
}
   
