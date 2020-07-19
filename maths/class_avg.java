import java.util.*;
class avg
{
	private int a,b,c;
	private float res;
    public void get()
	{
        Scanner sc=new Scanner(System.in);
		System.out.print("enter 3 nos\n");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}	
	public void cal()
	{
		res=(a+b+c)/3.0f;
	}	
	public void put()
	{
	System.out.print("\na="+a);
	System.out.print("\nb="+b);
	System.out.print("\nc="+c);
	System.out.print("\naverage="+res);
	}
}
class class_avg
{
	public static void main(String args[])
	{
                         
		avg a=new avg();
		a.get();
		a.cal();
		a.put();
	} 
}