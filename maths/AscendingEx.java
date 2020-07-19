import java.util.*;
class Ascending1
{
	  private int a[]=new int[5];
	
		
	public void get(int b[])
	{
		a=b;
	}
	public void show()
	{
		for(int i=0;i<a.length;i++) 
		System.out.println(" "+a[i]);
	}
	public void call()
	{
		 int i,j,temp=0;
		 for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
			                   temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				}
			}
		}
	}
}
class AscendingEx
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Ascending1 a1=new Ascending1();
	int a[]=new int[5];
                 //int b[]={4,5,6,7,8};
	System.out.print("Enter array elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	a1.get(a);
	a1.call();
	a1.show();
	
}
}		
