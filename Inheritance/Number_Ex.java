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
    public void getNo(int n1,int n2,int n3)
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
      Number_Two two=new Number_Two();
      two.getNo(10,20,30);
      two.getTotal();
   }
}