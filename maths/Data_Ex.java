/*Passing Object as a parameter into member function*/
/*Addition of two objects having single data member*/
class Data
{
    private int n;
    public void getN(int a)
    {
      n=a;
    }
   public void showN()
   {
         System.out.println("\nN="+n);
    }
   public void add(Data d2)
   {
        int sum=n+d2.n;
        System.out.println("\nSum of Object D1 and D2="+sum);
   }
}
class Data_Ex
{
    public static void main(String args[])
    {
       Data d1=new Data();
       Data d2=new Data();
       d1.getN(10);
       d2.getN(20);
       System.out.println("\nData of D1:");
        d1.showN();
     System.out.println("\nData of D2:");
       d2.showN();
         
       d1.add(d2);
    }
}