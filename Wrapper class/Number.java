/*Converting Wrapper Objects into its equivalent data types*/
class Number
{
    public static void main(String args[])
	{
	    Integer a1=new Integer(10);
		int n=a1.intValue();
		Double d1=new Double(123.67);
		double n1=d1.doubleValue();
		System.out.println("\nObject A1:"+a1);
		System.out.println("\nData type N="+n);
		System.out.println("\nObject D1:"+d1);
		System.out.println("\nData type N1="+n1);
		
	}
}