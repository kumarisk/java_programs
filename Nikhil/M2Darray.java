import java.util.*;
class M2Darray
{
     public static void main(String args[])
     {
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int c[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter 1st array elements");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
                                	a[i][j]=sc.nextInt();
		}
	}
	System.out.print("Enter 2st array elements");
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
                                	b[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.print("\n");
	}

      }
}
