 class Test
{
    private int n1;
    private String name;
    public void get(int n,String nm)
    {
        n1=n;
        name=nm;
     }
    public void show()
    {
          System.out.println("\nNo1="+n1);
          System.out.println("\nString name="+name);
     }
}
class TestEx
{
   public static void main(String args[])
    {
        Test t=new Test();
         t.get(10,"AAA");
         t.show();
    }
}
    