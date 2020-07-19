class Number
{
    private static int n1;
    private static String nm;
    public static void get(int no,String nm1)
     {
        n1=no;
        nm=nm1;
     }
    public static void display()
    {
      System.out.println("\nN="+n1);
      System.out.println("\nName:"+nm);
   }
}
class Num_Ex1
{
    public static void main(String args[])
   {
      Number.get(1,"AAA");
      Number.display();
   }
}

