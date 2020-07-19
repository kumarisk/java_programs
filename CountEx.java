/*count the number of objects created by users*/
class Count
{
    static int cnt;
    public Count()
    {
      cnt++;
    }
}
class CountEx
{
     public static void main(String args[])
      {
         Count c1=new Count();
         Count c2=new Count();
         Count c3=new Count();
         System.out.println("\nNumber of Objects Created by user:"+Count.cnt);
         Count c4=new Count();
         Count c5=new Count();
             System.out.println("\nNumber of Objects Created by user:"+Count.cnt);
}
}
