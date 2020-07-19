/*Working with Interface variables*/
interface Bank
{
     int init_bal=1000;
	 public void accountInfo();
}
class Saving implements Bank
{
  private int bal;
  private String name;
  public void getDeposite(int n,String nm)  
  {
	  bal=init_bal+n;
	  name=nm;
	  
  }
  public void accountInfo()
  {
	  System.out.println("\nName of Client="+name);
	  System.out.println("\nInit Balance="+init_bal);
	  System.out.println("\nAvailable Bal="+bal);
   }
}
class BankEx
{
	public static void main(String args[])
	{
		Saving s=new Saving();
		s.getDeposite(1500,"AAA");
		s.accountInfo();
	}
}