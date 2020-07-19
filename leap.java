class leap
{
public static void main(String args[])
{
int year=Integer.parseInt(args[0]);
if(year%4==0)
System.out.println("The year is leap."+year);
else
System.out.println("The year is not leap."+year);
}
}