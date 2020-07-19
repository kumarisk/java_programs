/*A class can implements more than one Interface*/
interface Number_One
{
    int no1=100;
	public void showNo1();
}
interface Number_Two
{
    int no2=200;
	public void showNo2();
}
interface Number_Three
{
   int no3=300;
   public void showNo3();
}
class Average implements Number_One,Number_Two,Number_Three
{
   float avg;
   public void showAverage()
   {
	   avg=(no1+no2+no3)/3.0f;
	   System.out.println("Average="+avg);
   }
   public void showNo1()
   {
	   System.out.println("\nNo1="+no1);
   }
   public void showNo2()
   {
	   System.out.println("\nNo2="+no2);
	   
   }
   public void showNo3()
   {
	   System.out.println("\nNo3="+no3);
	   
   }
}
class AverageEx
{
	public static void main(String args[])
	{
		Average a=new Average();
	    a.showNo1();
		a.showNo2();
		a.showNo3();
		a.showAverage();
	}
}