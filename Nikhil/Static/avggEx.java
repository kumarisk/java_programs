class avgg
{
private static int n1;
private static int n2;
private static int n3;
private static float avg;
  public static void get(int no1,int no2,int no3)
  {
    n1=no1;
	n2=no2;
	n3=no3;
  }
  public static void cal()
  {
	avg=(n1+n2+n3)/3.0f;
  }
  public static void display()
  {
     System.out.println("Average="+avg);
  }
}
class avggEx
{
public static void main(String args[])
  {
    average.get(10,40,30);
	average.cal();
	average.display();
  }
}