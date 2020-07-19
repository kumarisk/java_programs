class Addition
{
   public void add(int a,int b)
    {
       System.out.println("\nAddition:"+(a+b));
    }
   public void add(float a,float b)
    {
        System.out.println("\nAddition:"+(a+b));
    }
   public void add(int a,float b)
   {
      System.out.println("\nAddition:"+(a+b));
   }
}
class Add_Ex
{
    public static void main(String args[])
   {
      Addition a=new Addition();
      a.add(56,67.0f);
      a.add(10,20);
      a.add(10.0f,20.0f);
  }
}
   